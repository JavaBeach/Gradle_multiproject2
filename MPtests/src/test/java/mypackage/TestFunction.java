package mypackage;

import org.junit.Assert;
import org.junit.Test;

public class TestFunction {
	
private StringData sd = new StringData();
	
	@Test
	public void testStringData() {
		Assert.assertEquals("hello!", sd.getStringData());
	}

}
