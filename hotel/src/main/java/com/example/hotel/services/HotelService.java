//package com.example.hotel;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class HotelService {
//    @Autowired
//    HotelRepository hotelRepository;
//    public List<Hotel> findHotel (Long id) {
//
//        Optional<Hotel> optionalValue = hotelRepository.findByNameContainingIgnoreCase()
//
//        List<Hotel> list = new ArrayList<>();
//        if (optionalValue.isPresent()) {
//            Hotel hotel = optionalValue.get();
//            System.out.println("have");
//            System.out.println(hotel.name);
//            list.add(hotel);
//            return list;
//        }
//        else
//        {
//            System.out.println("nulllllllllllllll");
//            return null;
//
//        }
//
//    }
//}
