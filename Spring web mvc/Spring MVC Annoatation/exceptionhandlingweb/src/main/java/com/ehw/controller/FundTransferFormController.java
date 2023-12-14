package com.ehw.controller;

import com.ehw.exception.InsufficientBalanceException;
import com.ehw.form.FundTransferForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
@RequestMapping("/fundtransfer.htm")
public class FundTransferFormController {

    @GetMapping
    public String showForm(ModelMap map){
        FundTransferForm form = new FundTransferForm();
        map.addAttribute("fundTransferForm",form);
        return "fundstransfer-form";
    }

    @PostMapping
    public String fundTransfer(@ModelAttribute("fundTransferForm")@Valid FundTransferForm form , BindingResult errors,
                               ModelMap map){
        if(errors.hasErrors()){
            return "fundstransfer-form";
        }

        //throwing dummy exception by condition to check exception handling
        if(form.getAmount()>500000){
            throw new InsufficientBalanceException("insufficient funds");
        }

        map.addAttribute("transactionId", UUID.randomUUID().toString());
        return "transactional-details";
    }



}
