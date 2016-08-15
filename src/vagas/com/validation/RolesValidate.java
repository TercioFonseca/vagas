package vagas.com.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vagas.com.enums.GMEnum;
import vagas.com.exceptions.InvalidRepeatedSymbolException;
import vagas.com.exceptions.InvalideRowException;

/**
 * @author ADMIN Classe de validação das regras de negócio
 */
public class RolesValidate extends Validate {

	private HashMap<String, String> roles;

	public RolesValidate(HashMap<String, String> roles) {
		this.roles = roles;
	}

	public boolean isInvalidSymbolRepeted(String row, HashMap<String, String> valuesValidate) {
		// como implementar algo fácil de modificar a validação?
		for (String key : valuesValidate.keySet()) {
			if (row.matches("\b(" + key + ")\b/s\1{" + valuesValidate.get(key) + ",}"))
				return false;
		}
		return true;
	}

	public boolean isValidRow(String row) {

		// valida se existe linha vazia
		if (row.matches("^$"))
			return false;
		// valida se existe um "is" na frase
		Pattern pattern = Pattern.compile("(\\p{javaSpaceChar}{1,}\\b(is)\\b\\p{javaSpaceChar}{1,}){1}");
		Matcher matcher = pattern.matcher(row);
		if(!matcher.find())
			return false;
		
		
		return true;
	}

	@Override
	public boolean validator(Object row) {

		String newRow = (String) row;
		if(!isValidRow(newRow))
			throw new InvalideRowException();
		
		if(isInvalidSymbolRepeted(newRow, roles))
			throw new InvalidRepeatedSymbolException();
		
		return true;

	}

}
