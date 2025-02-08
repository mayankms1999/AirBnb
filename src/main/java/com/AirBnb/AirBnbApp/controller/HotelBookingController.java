package com.AirBnb.AirBnbApp.controller;

import com.AirBnb.AirBnbApp.dto.BookingDto;
import com.AirBnb.AirBnbApp.dto.BookingRequest;
import com.AirBnb.AirBnbApp.dto.GuestDto;
import com.AirBnb.AirBnbApp.dto.GuestListDto;
import com.AirBnb.AirBnbApp.service.BookingService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookings")
public class HotelBookingController {

    private final BookingService bookingService;

    @PostMapping("/init")
    public ResponseEntity<BookingDto> initialiseBooking(@RequestBody BookingRequest bookingRequest) {
        return ResponseEntity.ok(bookingService.initialiseBooking(bookingRequest));
    }
//    @PostMapping("/{bookingId}/addGuests")
//    public ResponseEntity<BookingDto> addGuests(@PathVariable Long bookingId,
//                                                @RequestBody List<GuestDto> guestDtoList) {
//        return ResponseEntity.ok(bookingService.addGuests(bookingId, guestDtoList));
//    }
@PostMapping("/{bookingId}/add-guests")
public ResponseEntity<BookingDto> addGuests(@PathVariable Long bookingId, @RequestBody GuestListDto guestListDto) {
    List<GuestDto> guests = guestListDto.getGuestDtoList();
    return ResponseEntity.ok(bookingService.addGuests(bookingId, guests));
}
}