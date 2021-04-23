package api.automation.learning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

	@Test
	public void test(){
		SoftAssert sa=new SoftAssert();
		System.out.println("test steps-1");
		//Assert.assertEquals("b", "a");
		sa.assertEquals("a", "b");
		System.out.println("test steps-2");
		//sa.assertAll();
		
	}

}
