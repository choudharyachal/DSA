
import java.util.Scanner;

public class PeakProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int product=1;
        for(int j = 0;j<n;j++){
            product*=arr[j];
        
        }

        for(int j = 0;j<n;j++){
            arr[j]=product/arr[j];
            System.out.print(arr[j]+" ");
        
        }




        
    }
}