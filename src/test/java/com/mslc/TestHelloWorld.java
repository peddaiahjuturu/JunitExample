package com.mslc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

	private HelloWorld h;
	
	   @Before
	   public void setUp() throws Exception 
	   {
	      h = new HelloWorld();
	   }

	   @Test
	   public void testHelloEmpty() 
	   {
		   h.setName("");
		   h.setMessage("");
	      assertEquals(h.getName(),"");
	      assertEquals(h.getMessage(),"");
	   }
		
	   @Test
	   public void testHelloWorld() 
	   {
	      h.setName("World");
		    h.setMessage("");
	      assertEquals(h.getName(),"World");
	      assertEquals(h.getMessage(),"World!");
	   }
}
