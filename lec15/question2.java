
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++){
            int mn = i;
            for(int j = i;j<n-1;j++){
                if(arr[j]>arr[mn]){
                    mn = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mn];
            arr[mn] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            
        }

    }
}