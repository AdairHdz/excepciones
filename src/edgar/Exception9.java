/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edgar;

import java.util.logging.Level;
import java.util.logging.Logger;

class ExceptionA extends Exception {
	ExceptionA(String msg) { super(msg); } 	
}

class ExceptionB extends Exception {
	ExceptionB(String msg) { super(msg); } 	
}

class ExceptionC extends Exception {
	ExceptionC(String msg) { super(msg); } 		
}

public class Exception9 {
	public static void f(int x){
		if(x < 0) try {
                    throw new ExceptionA("x < 0");
                } catch (ExceptionA ex) {
                    Logger.getLogger(Exception9.class.getName()).log(Level.SEVERE, null, ex);
                }
		if(x == 0) try {
                    throw new ExceptionB("x == 0");
                } catch (ExceptionB ex) {
                    Logger.getLogger(Exception9.class.getName()).log(Level.SEVERE, null, ex);
                }
		if(x > 0) try {
                    throw new ExceptionC("x > 0");
                } catch (ExceptionC ex) {
                    Logger.getLogger(Exception9.class.getName()).log(Level.SEVERE, null, ex);
                }
	}
	/*public static void main(String[] args) {
		try {
			f(0);
			f(1);
			f(-1);
		// will catch any Exception type:
		} catch(Exception e) {
			System.out.println("Caught Exception");
			e.printStackTrace(System.out);
		} 
	}*/	
}