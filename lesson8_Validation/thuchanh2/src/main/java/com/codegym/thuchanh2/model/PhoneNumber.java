package com.codegym.thuchanh2.model;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PhoneNumber implements Validator {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public boolean supports(Class<?> clazz) {
        return PhoneNumber.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneNumber phoneNumber = (PhoneNumber) target;
        String number = phoneNumber.getNumber();
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "number", "number.empty");
        if (number.length()>11 || number.length()<10){
            errors.rejectValue("number", "number.length");
        }

        if (!number.startsWith("0")){
            errors.rejectValue("number", "number.startsWith");
        }

        if (!number.matches("(^[0-9]+$)")){
            errors.rejectValue("number", "number.matches");
        }
    }
}
