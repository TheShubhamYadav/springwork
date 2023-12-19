package com.sbj.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sbj.bo.ProductBO;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ProductDAO {
	private final String ALL_PRODUCT_QUERY = "select * from product";
	private final JdbcTemplate jdbcTemplate;
	
	public List<ProductBO> getAllProducts(){
		return jdbcTemplate.query(ALL_PRODUCT_QUERY, (rs, rowNum)->{
			return ProductBO.of().productNo(rs.getString(1)).
													productName(rs.getString(2)).
													manufacturerName(rs.getString(3)).
													details(rs.getString(4)).build();
		});
	}//

}
