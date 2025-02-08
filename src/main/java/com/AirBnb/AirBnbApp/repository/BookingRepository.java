package com.AirBnb.AirBnbApp.repository;

import com.AirBnb.AirBnbApp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}