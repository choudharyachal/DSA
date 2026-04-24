
import java.util.Scanner;

class MaxOf3Void{
    public static void max (int a , int b, int c){
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if (b>a && b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        max(a,b,c);
    }
}