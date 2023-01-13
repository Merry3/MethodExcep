import java.io.File;
public class exception {


    public class exceptions {
        public static void main(String[] args) {
            // try and catch , ArtimaticExeception
            /**  int[] numerator = {4, 8, 16, 32};
             int[] denominator = {2, 0, 4, 4};
             for (int i = 0; i < numerator.length; i++) {
             try {
             System.out.println((numerator[i] / denominator[i]));
             } catch (ArithmeticException ex) {
             System.out.println("You can't divide by zero!");
             }*/
            // finally
            /**int x,y;
             try{
             x=(Integer) null;
             y=(Integer)null;
             System.out.println("Product: " +x*y);
             }catch(NullPointerException e){
             System.out.println("notified the developer");
             }finally{
             //clean up
             System.out.println("finally here");
             }*/

            // NullPointerException
            /** int x,y;
             x=(Integer) null;
             y=(Integer)null;
             System.out.println("Product: " +x*y);*/
        }
    }
    // Program to demonstrate the ArrayIndexOutOfBoundException
    /** class sample_ArrayIndexOutOfBound {
     public static void main(String args[]) {
     try {
     int b[] = new int[6];
     b[8] = 2; // we are trying to access 9th element in an array of size 7
     } catch(ArrayIndexOutOfBoundsException e) {
     System.out.println ("The array index is out of bound");
     }
     }
     }*/




}
