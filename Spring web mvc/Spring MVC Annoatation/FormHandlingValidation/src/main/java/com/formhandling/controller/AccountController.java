package com.formhandling.controller;

import com.formhandling.dto.BankAccount;
import com.formhandling.form.NewAccountForm;
import com.formhandling.validator.AccountFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@Controller
@RequestMapping("/createaccount.htm")
public class AccountController {

    @Autowired
    private AccountFormValidator validator;
    @RequestMapping(method = RequestMethod.GET)
    public String showNewAccountForm(ModelMap map){
        NewAccountForm newAccountForm = new NewAccountForm();
        map.addAttribute("accountForm",newAccountForm);
        return "create-account";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createAccount(@ModelAttribute("accountForm")NewAccountForm newAccountForm, Errors errors,
                                ModelMap map){
        BankAccount account = null;

        if(validator.supports(newAccountForm.getClass())){
            validator.validate(newAccountForm,errors);
        }
        System.out.println("validation done");
        if(errors.hasErrors()){
            return "create-account";
        }

        account = BankAccount.of()
                .accountNo(UUID.randomUUID().toString()).accountHolderName(newAccountForm.getFullName()).ifscCode("SBIN000125").accountType(newAccountForm.getAccountType()).build();

        map.addAttribute("account",account);

        return "account-details";
    }
}
