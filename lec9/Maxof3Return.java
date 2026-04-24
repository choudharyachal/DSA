
import java.util.Scanner;

class Maxof3Return{
    public static int max(int a , int b , int c){
        if(a>b && a>c){
            return a;
        }else if (b>a && b>c){
            return b;
        }else {
            return c;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = max(a,b,c);

        if(x==a){
            System.out.print("a is greater");
        }
        else if(x==b){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}