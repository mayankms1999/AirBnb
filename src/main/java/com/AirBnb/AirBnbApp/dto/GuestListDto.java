package com.AirBnb.AirBnbApp.dto;

import java.util.List;

public class GuestListDto {
    private List<GuestDto> guestDtoList;

    // Getters and Setters
    public List<GuestDto> getGuestDtoList() {
        return guestDtoList;
    }

    public void setGuestDtoList(List<GuestDto> guestDtoList) {
        this.guestDtoList = guestDtoList;
    }
}