package com.example.hotel.repos;

import com.example.hotel.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long>  {

 List<Hotel> findByHotelNameContainingIgnoreCase(String name);
}
