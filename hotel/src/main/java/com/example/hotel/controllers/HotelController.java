package com.example.hotel.controllers;

import com.example.hotel.repos.HotelRepository;
import com.example.hotel.models.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hotels")
@CrossOrigin
public class HotelController {
   @Autowired
   HotelRepository hotelRepository;
   @GetMapping("/search")
    public List<Hotel> getHotels(@RequestParam String name){
        return  hotelRepository.findByHotelNameContainingIgnoreCase(name);
    }
   @PostMapping("/create")
    public Hotel createHotel (@RequestBody Hotel hotel){
       System.out.println(hotel);
       System.out.println(hotel.getNoOfRooms());
       System.out.println(hotel.getHotelName());
       System.out.println(hotel.getAddress().getCity());
       System.out.println(hotel.getAddress().getStreet());
       return hotelRepository.save(hotel);
   }
   @GetMapping("/getAllHotels")
    public List<Hotel> getAllHotels(){
       return hotelRepository.findAll();
   }
}

