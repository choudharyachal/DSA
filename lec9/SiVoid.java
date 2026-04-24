
import java.util.Scanner;

class SiVoid{
    public static void SI (int p,int r, int t){
        int s = p*r*t;
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        SI(p,r,t);
    }
}