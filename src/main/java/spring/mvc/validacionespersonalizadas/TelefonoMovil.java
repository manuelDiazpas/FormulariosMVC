package spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=TelefonoMovilValidacion.class)
@Target({ElementType.METHOD, ElementType.FIELD})//destinos validacion
@Retention(RetentionPolicy.RUNTIME)
public @interface TelefonoMovil {

	public String value() default "6";
	
	public String message() default "Debe empezar por 6. Requerimos de telefono movil";

	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}
