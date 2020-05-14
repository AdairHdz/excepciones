/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad22;

/**
 *
 * @author Leslie
 */

class ExceptionA extends Exception {
    ExceptionA(String msg) { super(msg); } 	
}

class ExceptionB extends Exception {
    ExceptionB(String msg) { super(msg); } 	
}

class ExceptionC extends Exception {
    ExceptionC(String msg) { super(msg); } 		
}

public class Ejercicio12 {
	// array element will be initialized to null:
	private static Integer[] x = new Integer[1];
	public void f(int x) throws ExceptionA, ExceptionB, ExceptionC {
		if(x < 0) throw new ExceptionA("x < 0");
		if(x == 0) throw new ExceptionB("x == 0");
		if(x > 0) throw new ExceptionC("x > 0");
	}	
}
