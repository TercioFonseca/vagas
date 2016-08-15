package vabas.com.test.testResources;

import java.util.HashMap;

import vagas.com.exceptions.InvalidSymbolException;

public class StringTestCaseInvalidValue extends TestCase {

	@Override
	protected void fillMapList() {
mapTestCases = new HashMap<String, Object>();
		
		mapTestCases.put("value invalid", false);
		mapTestCases.put("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?", false);
		mapTestCases.put("how much is pish tegj glob glob", true);		
		mapTestCases.put("how many Credits is glob prok Silver", true);
		mapTestCases.put("how many Credits is glob prok Gold", true);

	}

}
