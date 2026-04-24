
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("Enter the number to rotate: ");
        int k = sc.nextInt();
        for(int i = 0;i<k;i++){
            int temp = arr[0];
            for(int j = 0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        System.out.println("The rotated array is: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}

//5 6 7 1 2 3 4 output
// 1 2 3 4 5 6 7 rotate this 