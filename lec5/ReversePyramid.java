import java.util.Scanner;
class ReversePyramid {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    int space = 0;
    int star = 2*n-1;
    int r = 1;
    while(r <= n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;

            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
           System.out.println();
        space++;
        star-=2; 
        r++;
        }


    }
    
}