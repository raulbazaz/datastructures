package arrays;

import java.util.Scanner;

public class q1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } //taking array as an input
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println(i);
            } //printing out the index of the number found in the array
        }
    }
}
