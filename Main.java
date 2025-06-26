import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

        switch(num){
            case 1 :
                System.out.println("the number is 1");
                break;
            case 2 :
                System.out.println("the number is 2");
                break;

            case 3 :
                System.out.println("the number is 3");
                break;
            default:
                System.out.println("error");
        }
    }
}