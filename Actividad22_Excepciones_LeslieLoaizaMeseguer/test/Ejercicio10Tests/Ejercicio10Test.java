/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import actividad22.*;

/**
 *
 * @author Leslie
 */
public class Ejercicio10Test {
    
   @Test(expected = Exception.class)
   public void testF()throws Exception{
        Ejercicio10 e1 = new Ejercicio10();
        e1.fToTest();
   }
   
   public void testG() throws Exception{
       Ejercicio10 e2 = new Ejercicio10();
       e2.gToTest();
   }
}
