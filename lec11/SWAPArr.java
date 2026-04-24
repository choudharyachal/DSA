import java.util.Scanner;
public class SWAPArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Before Swapping: "+a);
        System.out.println("After Swapping: "+b);
    }
    
    
}