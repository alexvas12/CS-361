public class InnerMost_OuterMost{
    //Exercise 6:
    //Innermost/Outermost
    public static void main(String[]args){
        int n = 5;

        System.out.println("Factorial of " + n);
        int factorialOfN = (int)(factorial(n));
        System.out.println("Result of Factorial: " + factorialOfN);
    }
    
    public static long factorial(int n){
        System.out.println("Entering the factorial(" + n + ")");

        if(n == 1){
            System.out.println("Base case is reached at factorial(1)");
            return 1;
        }
        else{
            int result = (int)(n * factorial(n - 1));
            System.out.println("Factorial(" + n + ") =" + result);
            return result;
        }
    }
}