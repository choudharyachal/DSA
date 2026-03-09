
import java.util.Scanner;

public class straightline{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of x3");
        int x3 = sc.nextInt();
        System.out.println("Enter the value of y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of y2");
        int y2 = sc.nextInt();
        System.out.println("Enter the value of y3");
        int y3 = sc.nextInt();
        int m1 = y2-y1/x2-x1;
        int m2 = y3-y2/x3-x2;
        if(m1==m2){
            System.out.println("The line is straight");
        }else {
            System.out.println("The line is not straight");
        }

        
    }
}