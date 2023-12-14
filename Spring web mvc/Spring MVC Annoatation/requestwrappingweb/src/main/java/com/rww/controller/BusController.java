package com.rww.controller;

import com.rww.dto.BusDTO;
import com.rww.formobj.SearchBusForm;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class BusController{

    @RequestMapping("/availablebus.htm")
    public String searchBus(@ModelAttribute("searchBusForm") SearchBusForm form, Model model){
        List<BusDTO> buses = null;
        SecureRandom random = new SecureRandom();

        buses = IntStream.range(1000,1010).mapToObj(busNo->{
            BusDTO busDTO = BusDTO.of().operator("Rajhans").busType(form.getBusType()).source(form.getSource())
                            .destination(form.getDestination()).onBoardDate(form.getDate()).
                            departure(String.valueOf(random.nextInt(23)+":"+ random.nextInt(59))).
                            duration(String.valueOf(random.nextInt(50))).
                            arrival(String.valueOf(random.nextInt(23)+":"+ random.nextInt(59))).
                            rating(random.nextInt(5)).seatAvailable(random.nextInt(80)).
                            build();
            return busDTO;
        }).collect(Collectors.toList());

        model.addAttribute("availableBus",buses);
        return "available-bus";
    }
}
