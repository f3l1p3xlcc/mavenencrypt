package org.example.mavenproject2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class HelloWorldTest {
    public static HelloWorld hello;
    
    @BeforeClass
    public static void initHello() {
		hello = new HelloWorld();
	}
    
    @Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}
        
    
    @Test
    public void testEncrypt() throws Exception {
        String toEncrypt = "The shorter you live, the longer you're dead!";
        
    	byte[] encrypted = hello.encrypt(toEncrypt, "password");
            //assertEquals(7, result);
            Assert.assertNotNull(encrypted);
	} 
    
}