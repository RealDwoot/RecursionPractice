import java.io.*;
import java.util.*;


public class RecursionPractice {
    // Method 1
    // To calculate factorial
    static int factorial(int n)
    {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        int input = 10;
        int ans = factorial(input);

        System.out.println("Factorial of " + input + " is " + ans);

        System.out.println("The 0th fibonacci number is: " + fib(0));
        System.out.println("The 7th fibonacci number is: " + fib(7));
        System.out.println("The 25th fibonacci number is: " + fib(25));
    }


}
