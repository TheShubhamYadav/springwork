package com.bacw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductCatelogController {

    @RequestMapping("/productslist.htm")
    public String showProductCatelog(){
        return "product-catelog";
    }
}
