package com.sjv.formatter.factory;

import com.sjv.formatter.annotation.PhoneNumber;
import com.sjv.formatter.PhoneNumberFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class PhoneNumberAnnotationFormatterFactory implements AnnotationFormatterFactory<PhoneNumber> {

    @Autowired
    private PhoneNumberFormatter formatter;
    @Override
    public Set<Class<?>> getFieldTypes() {
        return new HashSet<>(Arrays.asList(com.sjv.form.PhoneNumber.class));
    }

    @Override
    public Printer<?> getPrinter(PhoneNumber annotation, Class<?> fieldType) {
        return formatter;
    }

    @Override
    public Parser<?> getParser(PhoneNumber annotation, Class<?> fieldType) {
        return formatter;
    }
}
