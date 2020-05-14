/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adairtests;

import org.junit.Test;
import static org.junit.Assert.*;
import adair.AdairException;
import org.junit.Before;
import sampleClass.Person;
import java.lang.Exception;
/**
 *
 * @author Adair Hernández
 */
public class AdairExceptionTests {
    private AdairException ae;
    private int[] array;
    



    @Test(expected = Exception.class)
    public void exercise1RainyDay() throws Exception{
        ae = new AdairException();
        ae.exercise1RainyDay();
    }
    
    @Test
    public void exercise1SunnyDay(){
        ae = new AdairException();
        ae.exercise1SunnyDay();
    }

    @Test(expected = NullPointerException.class)
    public void exercise2RainyDay(){
        ae = new AdairException();
        ae.exercise2RainyDay();
    }
    
    @Test
    public void exercise2SunnyDay(){
        ae = new AdairException();
        ae.exercise2SunnyDay();
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void exercise3RainyDay(){
        ae = new AdairException();
        ae.exercise3RainyDay();
    }

    
    @Test
    public void exercise3SunnyDay(){
        ae = new AdairException();
        ae.exercise3SunnyDay();
    }
    
    
    
}
