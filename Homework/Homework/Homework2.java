package Homework;

public class Homework2 {
    //Exercise 2:
    /*
     * The title of slide n, which in my case is 1 because my first name is Alex, is: 
     * "The Object Oriented Paradigm and Java"
     */

    //Exercise 4:
    /*
        * 
    */

    //Exercise 5:
    public static int fib(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    //direct link: https://github.com/alexvas12/CS-361/blob/master/Fibonacci.java
    
    //Exercise 6:
    //Innermost/Outermost
    public static void inner_outer(){
        
    }


    //testing
    public static void main(String[]args){
        System.out.println(fib(3));
    }

}