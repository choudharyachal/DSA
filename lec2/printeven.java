import java.util.Scanner;
class printeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i+=2){
            if (i % 2 == 0){
            System.out.println(i);
        }
        } 
    }
}