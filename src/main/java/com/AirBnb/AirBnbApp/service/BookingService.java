package com.AirBnb.AirBnbApp.service;


import com.AirBnb.AirBnbApp.dto.BookingDto;
import com.AirBnb.AirBnbApp.dto.BookingRequest;
import com.AirBnb.AirBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}