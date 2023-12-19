package com.sbj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sbj.service.ProductService;

@SpringBootApplication
public class BootJDBCApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootJDBCApplication.class, args);
		ProductService service = applicationContext.getBean(ProductService.class);
		service.getAllProduct().forEach(System.out::println);
	}

}
