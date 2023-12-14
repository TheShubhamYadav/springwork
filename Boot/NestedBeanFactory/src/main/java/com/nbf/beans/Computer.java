package com.nbf.beans;

import lombok.Builder;
import lombok.Data;

@Data
public class Computer {

    private Processor processor;
    private int ramSize;
    private int storageSize;
    private String operatingSystem;
}
