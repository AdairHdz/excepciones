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
class GException extends Exception {
	GException(String s) { super(s); }
}

class HException extends Exception {
	HException(String s) { super(s); }
}

public class Ejercicio10 {
    
    public Ejercicio10(){
        
    }
    public void g() throws GException {
		throw new GException("from g()");
    }
    
    public void gToTest() throws Exception{
        throw new GException("from g()");
    }
    
    public void f() {
		try {
			try {
				g();
			} catch(GException ge) {
				System.out.println("Caught GException in f inner try");
				ge.printStackTrace();
				throw new HException("from f(), inner try");
			}
		} catch(HException he) {
			System.out.println("Caught HException in f() outer try");
			he.printStackTrace(System.out);
		}
	}
        
    public void fToTest() throws Exception{
        throw new HException("from f(), inner try");
    }

}
