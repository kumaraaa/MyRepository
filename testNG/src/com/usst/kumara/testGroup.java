package com.usst.kumara;

import org.testng.annotations.Test;

public class testGroup {

	/**
	 * @param args
	 */
	
	@Test(groups={"systemtest"}) 
	public void testLogin() {
		System.out.println("test group about login");
	}
	
	@Test(groups = {"functiontest"}) 
	public void testOpenPage() {
		System.out.println("test group about open page!");
	}
	
}
