package com.AirBnb.AirBnbApp.repository;

import com.AirBnb.AirBnbApp.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}