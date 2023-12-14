package com.ehw.controller;

import com.ehw.exception.InsufficientBalanceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(InsufficientBalanceException.class)
    public ModelAndView insufficientBalanceException(InsufficientBalanceException e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error-page");
        modelAndView.addObject("errorMessage","Insufficient balance to transfer");
        return modelAndView;
    }

}
