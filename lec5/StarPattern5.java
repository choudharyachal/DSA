import java.util.Scanner;
class StarPattern5{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int star = 1;
    int space = (2*n)-3;
    int r = 1;
    while (r<=n){
        int i = 1;
        while (i<=star){
            System.out.print("* ");
            i++;
        }
        int j = 1;
        while (j<=space){
            System.out.print("  ");
            j++;
        }
        int k = 1;
        if(r==n){
            star--;
        }
        while (k<=star){
            System.out.print("* ");
            k++;
        }
        System.out.println();
        star++;
        space-=2;
        r++;
        
    }
    
}
}