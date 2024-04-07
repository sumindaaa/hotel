package com.example.hotel.controllers;

import com.example.hotel.models.Booking;
import com.example.hotel.models.Hotel;
import com.example.hotel.repos.BookingRepository;
import com.example.hotel.repos.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("booking")
@CrossOrigin
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    HotelRepository hotelRepository;
    @GetMapping("/getAllBooking")
    public Page<Booking> getAllBooking(@RequestParam int pageNumber, @RequestParam int pageSize){
        System.out.println(pageNumber);
        System.out.println(pageSize);
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Booking> bookings = bookingRepository.findAll(pageable);
        for(Booking booking : bookings){
          Long id = booking.getId();
            Optional<Hotel> hotel = hotelRepository.findById(id);
            if(hotel.isPresent()){
                booking.setHotel(hotel.get());
            }
        }
        return bookings;
    }


    @PostMapping("/save")
    public Booking saveBooking (@RequestBody Booking booking){
        System.out.println(booking.getHotel().getHotelName());
        return bookingRepository.save(booking);
    }

}
