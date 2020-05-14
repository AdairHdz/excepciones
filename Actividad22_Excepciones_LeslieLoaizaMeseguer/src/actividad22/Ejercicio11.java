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
public class Ejercicio11 {
        public void f(){
		try {
			g();
		} catch(GException ge) {
			System.out.println("Caught GException in f try");
			ge.printStackTrace();
			throw new RuntimeException(ge);
		}
	}
        
        public void g() throws GException {
		throw new GException("from g()");
	}
        
    public static void main(String[] args) {
        Ejercicio11 e = new Ejercicio11();
	e.f();
    }
}
