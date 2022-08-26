package com.group3.netflix.utilities.validation;

import javax.validation.Constraint;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MinCurrentYearValidator.class)
public @interface MinCurrentYear {
    String message() default "Year is in the future";

    Class<?>[] groups() default{};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        MinCurrentYear[] value();
    }
}
