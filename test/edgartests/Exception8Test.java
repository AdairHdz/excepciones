/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edgartests;


import edgar.Exception4;
import edgar.Exception8;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgar
 */
public class Exception8Test {
    
    Exception8 ex8;
    
    
    @Test(expected = Exception.class)
    public void test() throws Exception4{
        ex8 = new Exception8();
        ex8.f();
    }
}
