package com.vtw.controller;

import com.vtw.dto.OrderDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OrderHistoryController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<OrderDto> orders = null;
        ModelAndView modelAndView = new ModelAndView();
        String viewType = request.getParameter("viewType");

        if(viewType==null || viewType.trim().length()==0){
            modelAndView.setViewName("order-history");
            return modelAndView;
        }

        int months = Integer.parseInt(request.getParameter("months"));
        orders = IntStream.range(1,months*2).mapToObj(o->{
            OrderDto orderDto = new OrderDto();
            orderDto.setOrderNo(String.valueOf(o));
            orderDto.setOrderedDate(LocalDate.now().minusDays(15*o));
            orderDto.setAmount(new SecureRandom().nextLong(100,10000));
            orderDto.setDescription("online paid");
            orderDto.setStatus(o % 2 == 0 ? "delivered" : "returned");
            return orderDto;
        }).collect(Collectors.toList());

        modelAndView.addObject("orderlist",orders);
        modelAndView.addObject("months", months);

        if(viewType.equalsIgnoreCase("pdf")) {
            modelAndView.setViewName("orderHistoryPDFView");
        }
        else if(viewType.equalsIgnoreCase("xls")) {
            modelAndView.setViewName("orderHistoryXLSView");
        }
        else {
            modelAndView.setViewName("order-history");
        }

        return modelAndView;
    }
}
