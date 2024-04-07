package com.example.hotel.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Optional;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate checking;
    LocalDate checkout;
    Integer guest;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    Hotel hotel;

    public Long getId() {
        return id;
    }

    public LocalDate getChecking() {
        return checking;
    }

    public void setChecking(LocalDate checking) {
        this.checking = checking;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Integer getGuest() {
        return guest;
    }

    public void setGuest(Integer guest) {
        this.guest = guest;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
