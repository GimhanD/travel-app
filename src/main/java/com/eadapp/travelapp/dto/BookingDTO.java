package com.eadapp.travelapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingDTO {
    private Integer id;
    private String destination;
    private Integer noPassengers;
    private String vehicleType;
}
