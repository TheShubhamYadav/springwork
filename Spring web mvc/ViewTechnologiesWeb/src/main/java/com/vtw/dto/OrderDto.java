package com.vtw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private String orderNo;
    private LocalDate orderedDate;
    private String description;
    private long amount;
    private String status;

}
