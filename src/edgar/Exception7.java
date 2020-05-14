package edgar;

import java.util.logging.*;
import java.io.*;
public class Exception7 {
   private static Logger logger =
   Logger.getLogger("E07_LoggedArrayIndexBounds");
   public static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
}
public static void main(String args[]) {
    char[] array = new char[10];
    try {
        array[10] = 'x';
    } catch(ArrayIndexOutOfBoundsException e) {
        logException(e);
        }
    }
}
