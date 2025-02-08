package com.AirBnb.AirBnbApp.dto;

import com.AirBnb.AirBnbApp.entity.User;
import com.AirBnb.AirBnbApp.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
//    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
