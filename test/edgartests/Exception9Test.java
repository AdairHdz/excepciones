/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edgartests;

import edgar.Exception9;


import org.junit.Test;


public class Exception9Test {
    
    Exception9 ex9;
    
    @Test(expected = Exception.class)
    public void test(){
        ex9 = new Exception9();
        ex9.f(2);
    }
}
