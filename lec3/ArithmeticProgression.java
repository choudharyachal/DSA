
import java.util.Scanner;

public class ArithmeticProgression{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter a value of d: ");
        int d = sc.nextInt();
        for (int i = 1; i<=50; i++){
            System.out.println("The following series are : "+a);

            a=a+d;
           
        }

    }
}