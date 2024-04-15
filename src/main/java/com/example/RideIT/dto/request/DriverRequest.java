package com.example.RideIT.dto.request;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DriverRequest {
    String name;
    String emailId;
    String mobNo;
    String panNo;

    CabRequest cabRequest;
}
