package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test (priority=1)
	public void testSoftAssert() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 started");
		assertion.assertEquals(12, 13);
		System.out.println("Test 1 completed");
		assertion.assertAll();
	}
	
	@Test(priority=2)
	public void testHardAssert() {
		System.out.println("Test 2 started");
		Assert.assertEquals(12, 13);
		System.out.println("Test 2 completed");
	}
	
	@Test(priority=3)
	public void testHardAssert2() {
		System.out.println("Test 3 started");
		Assert.assertEquals(12, 12);
		System.out.println("Test 3 completed");
	}

}
