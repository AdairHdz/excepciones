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
/**
 *
 * @author Adair Hernández
 */
public class AdairExceptionTests {
    private AdairException ae;
    private int[] array;
    
    @Test(expected = Exception.class)
    public void testException() throws Exception{
        ae = new AdairException();
        ae.exercise1ToTest();
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullPointerException(){
        ae = new AdairException();
        ae.exercise2(null);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIndexOutOfBoundsException(){
        ae = new AdairException();
        this.array = new int[10];
        ae.exercise3(array);
    }
    
}
