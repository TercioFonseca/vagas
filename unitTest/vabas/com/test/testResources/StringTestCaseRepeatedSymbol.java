package vabas.com.test.testResources;

import java.util.HashMap;
import java.util.Map;

import vagas.com.exceptions.InvalidRepeatedSymbolException;
import vagas.com.exceptions.MaxLengthRepeatedException;

public class StringTestCaseRepeatedSymbol extends TestCase {	
	
	
	
	protected void fillMapList(){
		mapTestCases = new HashMap<String, Object>();
		
		mapTestCases.put("prok prok prok prok", new InvalidRepeatedSymbolException());
		mapTestCases.put("tegj tegj tegj tegj", new InvalidRepeatedSymbolException());
		mapTestCases.put("prok tegj prok tegj", true);
		mapTestCases.put("prok tegj tegj prok", new InvalidRepeatedSymbolException());
		mapTestCases.put("glog glog glog", true);
		mapTestCases.put("glog glog glog glob", new MaxLengthRepeatedException());
		mapTestCases.put("pish pish pish", true);
		mapTestCases.put("pish pish pish pish", new MaxLengthRepeatedException());
		mapTestCases.put("pish pish pish prok pish pish", true);
		mapTestCases.put("glog glog glog prok glog prok", true);
		
		
	}
	
	

}
