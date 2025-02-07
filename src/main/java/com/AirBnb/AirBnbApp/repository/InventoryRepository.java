package com.AirBnb.AirBnbApp.repository;

import com.AirBnb.AirBnbApp.entity.Inventory;
import com.AirBnb.AirBnbApp.entity.Room;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}