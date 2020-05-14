/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adair;

import sampleClass.Person;

/**
 *
 * @author Adair Hernández
 */
public class AdairException {

    public void exercise1SunnyDay(){
        try {
        } catch (Exception e) {
            System.err.println("Caught Exception1");
            e.printStackTrace();
        } finally {
            System.out.println("Made it to finally");
        }
    }
    
    public void exercise1RainyDay() throws Exception {
        throw new Exception("This is my message");
    }


    public void exercise2SunnyDay() {
        Integer i = null;
        try {
            i = 10;
            System.out.println(i.toString());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException");
            e.printStackTrace();
        } finally {
            System.out.println("Got through it");
        }
    }

    public void exercise2RainyDay() {
        Integer i = null;
        System.out.println(i.toString());
    }

    public void exercise3RainyDay() {
        int[] ia = new int[2];
        ia[2] = 3;
    }

    public void exercise3SunnyDay() {
        int[] ia = new int[2];
        try {
            ia[2] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(
                    "Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }

    }

}
