package com.AirBnb.AirBnbApp.service;

import com.AirBnb.AirBnbApp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
