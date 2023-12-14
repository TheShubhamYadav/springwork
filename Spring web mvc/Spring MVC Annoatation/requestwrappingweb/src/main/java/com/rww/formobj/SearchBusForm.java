package com.rww.formobj;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class SearchBusForm {
    private String source;
    private String destination;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
    private String busType;
}
