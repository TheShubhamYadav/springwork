package com.sbj.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class ProductDTO {
	private String productName;
	private String details;
	
}
