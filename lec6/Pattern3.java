import java.util.Scanner;
class Pattern3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int star = n-1;
    int space = 1;
    int r = 1;
    while (r<=(2*n)-1){
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
        while (k<=star){
            System.out.print("* ");
            k++;
        }
        

        System.out.println();
        
        if(r<n){
            star--;
            space+=2;
        }
        else{
            star++;
            space-=2;
        }
        r++;
    }
    
}
}