package exceptionDemo;

public class PracticeQuestionExceptionHandling {

    public static void main(String args[]) {
        System.out.println("Program starts");

        try {
            double k=2/20;
            System.out.println("Array elements"+k);
        } 
        catch(ArithmeticException e){
        	System.out.println("Error occured");
        }
        finally{
        	System.out.println("Progmmed over");
        }
    }
}
