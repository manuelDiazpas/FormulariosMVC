package spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TelefonoMovilValidacion implements ConstraintValidator<TelefonoMovil, String> {

	private String numTel;
	
	@Override
	public void initialize(TelefonoMovil num) {
		
		numTel = num.value();
	}
		
	
	@Override //comprueba que el codigo es de la region en concreto
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		boolean valorNum;
		
		if(arg0 != null) {
			valorNum = arg0.startsWith(numTel);
		}else {
			return valorNum = true;
		}
		return valorNum;
	}
		
		
	}

