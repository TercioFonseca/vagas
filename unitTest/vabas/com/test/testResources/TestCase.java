package vabas.com.test.testResources;

import java.util.Map;

public abstract class TestCase {
	
protected static Map<String, Object> mapTestCases;
	
	protected abstract void fillMapList();
	
	public Map<String, Object> getCases(){
		if(mapTestCases==null)
			fillMapList();
		return mapTestCases;
	}

}
