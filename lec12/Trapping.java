
import java.util.Scanner;

public class Trapping {
    public static int calculatewater (int[] height) {
        int n = height.length;
        int water = 0;
        for(int i = 1; i<n; i++) {
            int leftMax = height[i];
            int rightMax = height[i];
            for(int j = 0; j<=1; j++) {
                if(height[j] > leftMax){
                    leftMax = height[j];
                }
            }
            for(int j = i; j<n;j++) {
                if(height[j]>rightMax) {
                    rightMax = height[j];
                }
            }
            water += Math.min(leftMax, rightMax)-height[i];
        }
        return water;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter heights: ");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = calculatewater(arr);
        System.out.println("Total water = "+result); 
        

    }
}