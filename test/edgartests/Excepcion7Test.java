/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edgartests;

import edgar.Exception7;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edgar
 */
public class Excepcion7Test {
    private Exception7 ex7;
    
    @Test(expected = Exception.class)
    public void test(){
        ex7 = new Exception7();
        try{
            ex7.logException(null);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
