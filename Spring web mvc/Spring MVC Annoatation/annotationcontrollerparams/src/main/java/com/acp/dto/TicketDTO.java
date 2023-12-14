package com.acp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Builder(builderMethodName = "of")
@Getter
public class TicketDTO {
    private String pnrNo;
    private String passengerName;
    private String source;
    private String destination;
    private LocalDate boardingDate;
    private String status;
    private double fareAmount;

}
