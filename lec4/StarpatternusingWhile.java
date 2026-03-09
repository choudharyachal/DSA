import java.util.Scanner;
class StarpatternusingWhile {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of rows:");
     int r = sc.nextInt();
     int i = 1;
     while(i<=r) {
        int j = 1;
        while(j<=r){
            System.out.print("* ");
            j++;
            }
            System.out.println();
            i++;

        }
     }
}     