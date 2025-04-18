package mx.uv.hefv.SpringBoot_API.controller.report;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import jakarta.validation.Constraint;

@Target(ElementType.FIELD) //<1>
@Retention(RetentionPolicy.RUNTIME) //<2>
@Constraint(validatedBy = {ReportDescriptionValidator.class}) //<3>
public @interface ValidReportDescription {
    String message() default "Invalid report description"; //<4>

    Class<?>[] groups() default {}; //<5>

    Class<? extends Payload>[] payload() default {}; //<6>
}
