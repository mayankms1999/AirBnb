package com.AirBnb.AirBnbApp.service;

import com.AirBnb.AirBnbApp.dto.HotelDto;
import com.AirBnb.AirBnbApp.dto.HotelSearchRequest;
import com.AirBnb.AirBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
