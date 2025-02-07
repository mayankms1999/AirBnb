package com.AirBnb.AirBnbApp.repository;

import com.AirBnb.AirBnbApp.entity.Hotel;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}

