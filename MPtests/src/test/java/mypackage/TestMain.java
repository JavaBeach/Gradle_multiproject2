package mypackage;

import org.junit.Assert;
import org.junit.Test;

public class TestMain {
	
private IntData intdata = new IntData();
	
	@Test
	public void testIntData() {
		Assert.assertEquals(1234, intdata.getIntData());
	}

}
