package com.sbj.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(builderMethodName = "of")
public class ProductBO {
	
	private String productNo;
	private String productName;
	private String manufacturerName;
	private String details;
	
}
