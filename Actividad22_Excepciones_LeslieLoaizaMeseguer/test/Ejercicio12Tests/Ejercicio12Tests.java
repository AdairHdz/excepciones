/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12Tests;

import actividad22.Ejercicio12;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leslie
 */
public class Ejercicio12Tests {
    
   @Test(expected = Exception.class)
   public void testF()throws Exception{
        Ejercicio12 e1 = new Ejercicio12();
        e1.f(1);
   }
   
   @Test(expected = Exception.class)
   public void testF2()throws Exception{
        Ejercicio12 e2 = new Ejercicio12();
        e2.f(0);
   }
   
   @Test(expected = Exception.class)
   public void testF3()throws Exception{
        Ejercicio12 e3 = new Ejercicio12();
        e3.f(-1);
   }
}
