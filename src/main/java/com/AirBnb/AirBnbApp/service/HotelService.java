package com.AirBnb.AirBnbApp.service;

import com.AirBnb.AirBnbApp.dto.HotelDto;
import com.AirBnb.AirBnbApp.dto.HotelInfoDto;
import org.springframework.stereotype.Service;


public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}