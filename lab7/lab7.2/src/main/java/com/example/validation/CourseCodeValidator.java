package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeValidator implements ConstraintValidator <CourseCode,String>{
    @Override
    public boolean isValid(String o, ConstraintValidatorContext constraintValidatorContext) {
        return o.toLowerCase().startsWith("luv");
    }


    @Override
    public void initialize(CourseCode constraintAnnotation) {
    }
}
