package com.usst.kumara;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterXML {
	
	@Test
	@Parameters({"parameter1","parameter2"})   
    public void parameter(String parameter1,String parameter2)
    {
        System.out.println("parameter1 is " + parameter1);
        System.out.println("parameter2 is " + parameter2);
    }
	
}