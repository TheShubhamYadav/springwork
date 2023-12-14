package com.acp.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import java.security.SecureRandom;

@Controller
@SessionAttributes({"passengerName","source","destination","boardingDate"})//bind to session scope
public class TicketBookingController {

//    @RequestMapping("/bookingpage2.htm")
//    public String bookTicket(WebRequest request,HttpSession session){
//        request.getParameterMap().forEach((paramName,paramValue)->{
//            session.addAttribute(paramName,paramValue);
//        });
//        return "ticketbookingform2";
//    }
    //--> but using HttpSession make our comp tightly coupled with servletapi so below is another way


    @RequestMapping("/bookingpage2.htm")
    public String bookTicket(WebRequest request,ModelMap map){
        request.getParameterMap().forEach((paramName,paramValue)->{
            map.addAttribute(paramName,paramValue);//form data will store in modelmap ,then when
            // control return to RMHA(request mapping handler adapter)
            // it will see into modelmap & those are annotated with @Sessionattribute
            // will be kept in session scope
        });
        return "ticketbookingform2";
    }

    @RequestMapping("/bookedticket.htm")
    public String showBookedTicket(WebRequest request,
                                   @SessionAttribute("passengerName") String passengerName, //access from session scope
                                   @SessionAttribute("source") String source,
                                   @SessionAttribute("destination") String destination,
                                   @SessionAttribute("boardingDate") String boardingDate,
                                   SessionStatus status,
                                   ModelMap map){

        String identityType = request.getParameter("identityType");
        String idNo = request.getParameter("idNo");

        map.addAttribute("identityType",identityType);
        map.addAttribute("idNo",idNo);

        //below line just  for showing values
        map.addAttribute("pnrNo","PNR"+new SecureRandom().nextLong(10000,99999));
        map.addAttribute("fareAmount", new SecureRandom().nextInt(100,1000));
        //

        //to check whether sessionscoped attribute are available or not
        System.out.println(passengerName+" booked ticket for travelling from "+source+" to "+destination+" on "+boardingDate);

        //to remove only those attribute from session scope which are
        //Annoated with @SessionAttribute at controller class level(line no 15)
        status.setComplete();

        return "booked-ticket";//return lvn
    }
}
