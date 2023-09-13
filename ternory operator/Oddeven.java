public class Oddeven
{

     public static void main(String []args){
        try {
            int number = 21;

            if (number % 2 == 0) {
                System.out.println("number is even.");
            } else {
                throw new ArithmeticException(number + " is odd.");
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
     }
}