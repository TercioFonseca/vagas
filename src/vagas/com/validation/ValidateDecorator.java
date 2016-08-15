package vagas.com.validation;

public class ValidateDecorator extends Validate {

	private Validate validate;
	
	public ValidateDecorator(Validate validate){
		this.validate = validate;
	}
	@Override
	public boolean validator(Object row) {
		this.validate.validator(row);
		return true;
	}

}
