package com.group3.netflix.utilities.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Calendar;

public class MinCurrentYearValidator implements ConstraintValidator<MinCurrentYear, String> {
    @Override
    public void initialize(MinCurrentYear constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext ctx) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        try {
            int given = value.equals("") ? 0 : Integer.parseInt(value);
            return given <= currentYear;
        } catch(Exception e) {
            return false;
        }
    }
}
