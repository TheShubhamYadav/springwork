package com.sjv.controller;

import com.sjv.form.LoanApplicationForm;
import com.sjv.validator.LoanApplicationValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/loanapp.htm")
public class LoanApplicationController {


    @Autowired
    private LoanApplicationValidator validator;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(validator);
    }

    @GetMapping
    public String showLoanApplicationForm(ModelMap map){
        LoanApplicationForm loanApplicationForm = new LoanApplicationForm();
        map.addAttribute("loanApplicationForm",loanApplicationForm);
        return "loan-application";
    }

    @PostMapping
    public String applyLoan(@ModelAttribute("loanApplicationForm")@Valid LoanApplicationForm form, BindingResult errors,
                            ModelMap map){

        if(errors.hasErrors()){
            return "loan-application";
        }

        //blogic ...

        map.addAttribute("referenceNo", UUID.randomUUID().toString());
        return "loan-application-success";

    }
}
