package com.AirBnb.AirBnbApp.repository;

import com.AirBnb.AirBnbApp.entity.Room;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

