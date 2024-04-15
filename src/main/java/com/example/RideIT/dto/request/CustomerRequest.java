package com.example.RideIT.dto.request;

import com.example.Ridelt.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequest {
    String name;
    int age;
    String emailId;
    String address;
    Gender gender;
}
