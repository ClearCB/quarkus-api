package edu.craptocraft.models;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE_USE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { NotExpiredValidator.class })

public @interface NotExpired {

    // The message displayed when validation error
    String message() default "Beer must not be expired";

    // Group of validation
    Class<?>[] groups() default {};

    // Add metadata about the error, and the problems
    Class<? extends Payload>[] payload() default {};
}
