
import java.util.Scanner;

class SiReturn{
    public static int SI (int p,int r, int t){
        int s = p*r*t;
        return(s); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int s = SI(p,r,t);
        System.out.println(s);
    }
}