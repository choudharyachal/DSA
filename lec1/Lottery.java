
import java.util.Scanner;

class Lottery{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your number:");
       int n = sc.nextInt();
       if (n>=300 && n<=460){
        System.out.println("The prize is Macbook");
       }else if (n>=200 && n<=280){
         System.out.println("The prize is Kurkure");
       }else if (n>=1100 && n<=1500){
         System.out.println("The prize is cycle");
       }else if (n>=50 && n<=80){
        System.out.println("The prize is bike");
       }else{
        System.out.println("Better luck next time");
       }
    }
}