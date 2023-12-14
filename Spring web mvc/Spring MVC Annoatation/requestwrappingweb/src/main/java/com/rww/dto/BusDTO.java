package com.rww.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Builder(builderMethodName = "of")
@Data
public class BusDTO {
    private String operator;
    private String busType;
    private String source;
    private String destination;
    private LocalDate onBoardDate;
    private String departure;
    private String duration;
    private String arrival;
    private int rating;
    private int seatAvailable;
}

