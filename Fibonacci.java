import java.util.Scanner;

public class Fibonacci{
    public static int fib(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Asking user for number input");
        
        String input = scnr.nextLine();
        try
            {
                int n = Integer.parseInt(input);
                
                if(n < 0 || n > 45){
                    System.out.println("Number must be within the range of 0....45");
                }
                else{
                    System.out.println("The fibonacci number of the first " + n + " terms is: " + fib(n));
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Integer must be used");
            }
    }
}

