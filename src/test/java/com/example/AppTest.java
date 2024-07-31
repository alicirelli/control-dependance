package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
 public void testCapitalizeString() {
        String input = "hello world";
        String expectedOutput = "Hello world";
        String actualOutput = App.capitalizeString(input);
        assertEquals(expectedOutput, actualOutput);
    }
    public void testConvertToJson() throws JsonProcessingException {
        Personne personne = new Personne("alina", "cirelli");
        String expectedJson = "{\"fistName\":\"alina\",\"lastName\":cirelli}";
        String actualJson = App.convertToJson(personne);
        assertEquals(expectedJson, actualJson);
    }
}
