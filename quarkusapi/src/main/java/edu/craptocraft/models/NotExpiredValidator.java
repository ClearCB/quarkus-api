package edu.craptocraft.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotExpiredValidator implements ConstraintValidator<NotExpired, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {

        if (value == null)
            return true;

        LocalDate now = LocalDate.now();

        // The expiration date is higher than "today", so the product is not expired.
        return ChronoUnit.YEARS.between(value, now) > 0;
    }
}
