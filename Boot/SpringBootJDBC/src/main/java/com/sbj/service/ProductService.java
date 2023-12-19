package com.sbj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sbj.bo.ProductBO;
import com.sbj.dao.ProductDAO;
import com.sbj.dto.ProductDTO;

import lombok.AllArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ProductService {
	private final ProductDAO dao;

	@Transactional(readOnly = true)
	public List<ProductDTO> getAllProduct(){
		return dao.getAllProducts().stream().map(bo->{
			return ProductDTO.of().productName(bo.getProductName()).details(bo.getDetails()).build();
		}).toList();
	}
	

}
