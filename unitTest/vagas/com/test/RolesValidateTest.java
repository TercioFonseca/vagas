package vagas.com.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import vabas.com.test.testResources.StringTestCaseInvalidValue;
import vabas.com.test.testResources.TestCase;
import vagas.com.validation.RolesValidate;

/*
 * The symbols "I", "X", "C", and "M" can be repeated three times in succession, but no more. (They
may appear four times if the third and fourth are separated by a smaller value, such as XXXIX.)
"D", "L", and "V" can never be repeated.
"I" can be subtracted from "V" and "X" only. "X" can be subtracted from "L" and "C" only. "C" can
be subtracted from "D" and "M" only. "V", "L", and "D" can never be subtracted.
Only one small-value symbol may be subtracted from any large-value symbol.
glob is I
prok is V
pish is X
tegj is L
glob glob Silver is 34 Credits
glob prok Gold is 57800 Credits
pish pish Iron is 3910 Credits
 * 
 * */
public class RolesValidateTest {

	
	@Test
	public void ValidateInvalidSymbols() {

		TestCase invalidSymbol = new StringTestCaseInvalidValue();
		HashMap map = new HashMap<String,String>();
		
		RolesValidate rolesvalidate = new RolesValidate(map);
	for(String key : invalidSymbol.getCases().keySet()){
		assertEquals(invalidSymbol.getCases().get(key), rolesvalidate.isValidRow(key));
	}
		
		
	}

	public void ValidateRepeatedLimit() {
		String teste1 = "glog glog glog";
		String teste2 = "glog glog glog glob";
		String teste3 = "pish pish pish";
		String teste4 = "pish pish pish pish";
		String teste5 = "pish pish pish prok pish pish";
		String teste6 = "glog glog glog prok glog prok";

	}
}
