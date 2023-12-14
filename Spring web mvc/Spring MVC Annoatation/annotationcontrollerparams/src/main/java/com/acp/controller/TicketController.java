package com.acp.controller;

import com.acp.dto.TicketDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Map;

@Controller
public class TicketController{

//    @RequestMapping("/ticketdetails.htm")
//    public ModelAndView getTicketDetails(HttpServletRequest request, HttpServletResponse response){
//        String pnrNo = request.getParameter("pnrNo");
//        TicketDTO ticketDTO = TicketDTO.of().pnrNo(pnrNo).passengerName("Vinay Bharadwaj")
//                            .source("Indore").destination("Bhopal").boardingDate(LocalDate.now()).
//                            fareAmount(300).status("reserved").build();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("ticket",ticketDTO);
//        modelAndView.setViewName("ticket-details");
//        return modelAndView;
//    }

    @RequestMapping("/ticketdetails.htm")
    public String getTicketDetails(WebRequest request, Map<String,Object> map){
        String pnrNo = request.getParameter("pnrNo");
        TicketDTO ticketDTO = TicketDTO.of().pnrNo(pnrNo).passengerName("honey jain")
                .source("Indore").destination("pune").boardingDate(LocalDate.now()).
                fareAmount(300).status("reserved").build();
        map.put("ticket",ticketDTO);
        return "ticket-details";
    }

}
