
import java.util.Scanner;

class SumofNReturn{
    public static int Natural(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return (sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =Natural(n);
        System.out.println(x);
    }
}