package com.sjv.formatter;

import com.sjv.form.PhoneNumber;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;

import java.text.ParseException;
import java.util.Locale;

@Component
public class PhoneNumberFormatter implements Formatter<PhoneNumber> {
    @Override
    public PhoneNumber parse(String text, Locale locale) throws ParseException {
        PhoneNumber phoneNumber = new PhoneNumber();
        int endIndex = text.length()-1;
        if(text.length()>10){
            phoneNumber.setCountryCode(text.substring(0,endIndex-9)); //in substring endindex is exclusive so took -9
            phoneNumber.setPhoneNumber(text.substring(endIndex-9));
        }
        else if(text.length()==10){
            phoneNumber.setCountryCode("");
            phoneNumber.setPhoneNumber(text);
        }
        return phoneNumber;
    }

    @Override
    public String print(PhoneNumber object, Locale locale) {
        return object.getCountryCode()+""+object.getPhoneNumber();
    }
}
