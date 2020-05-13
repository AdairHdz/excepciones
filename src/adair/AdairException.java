/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adair;

/**
 *
 * @author Adair Hernández
 */
public class AdairException {
    public void exercise1() {
        try {
            throw new Exception("This is my message");
        } catch (Exception e) {
            System.out.println("An exception occured: " + e.getMessage());
        } finally {
            System.out.println("I was here");
        }
    }
    
    public void exercise1ToTest() throws Exception{
        throw new Exception();
    }
    
    public void exercise2(){
        Object myObject = null;
        try{
            myObject.toString();
        }catch(NullPointerException e){
            System.out.println("A NullPointerException occured");
        }
    }
    
    public void exercise2(Object object){
        System.out.println(object.toString());
    }
    
    public void exercise3(){
        int[] myArray = new int[10];
        try{
            myArray[10] = 4;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("An ArrayIndexOutOfBoundsException has occured");
        }
    }
    
    public void exercise3(int[] myArray){
        myArray[myArray.length + 10] = 0;
    }
}
