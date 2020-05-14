/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11Test;

import actividad22.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leslie
 */
public class Ejercicio11Test {
    
   @Test(expected = Exception.class)
   public void testF()throws Exception{
        Ejercicio11 e1 = new Ejercicio11();
        e1.f();
   }
   
   @Test(expected = Exception.class)
   public void testG() throws Exception{
       Ejercicio11 e2 = new Ejercicio11();
       e2.g();
   }
}
