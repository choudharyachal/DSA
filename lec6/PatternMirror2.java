import java.util.Scanner;
class PatternMirror2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of rows:");
     int r = sc.nextInt();
     int star =1;
     int space = r-1;
     for (int i = 1; i<=2*r-1;i++) {
        for( int j = 1;j<=space;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=star;j++){
            System.out.print("* ");
        }
        if(i<r){
            star++;
            space--;
        }else{
            star--;
            space++;
        }
        System.out.println();
       
    }
        
     
    }  
}   