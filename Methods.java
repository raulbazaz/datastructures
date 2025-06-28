import java.util.Scanner;

public class Methods {

//    public static int sumTwo(int a, int b){
//
//        return a+b;
//
//    }

    // finding the factorial of a number

    public static void numFactorial(int n){
        int factorial = 1;
        for (int i=n ; i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }


    public static void main(String args[]){
//        int finalAnswer = sumTwo(1,2);
//        System.out.println(finalAnswer);
        numFactorial(5);
    }
}
