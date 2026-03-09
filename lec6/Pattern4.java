import java.util.Scanner;
class Pattern4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = 1;
    int star = n;
    int space = 0;
    while (r<=n){
        int i = 1;
        while  (i<=star) {
            System.out.print("* ");
            i++;
        }
        int j = 1;
        while (j <= space){
            System.out.print("  ");
            j++;
        }
        int k = 1;
        while (k<=star){
            System.out.print("* ");
            k++;
        }
        System.out.println();
        star--;
        space += 2;
        r++;
    }
    }
        
}