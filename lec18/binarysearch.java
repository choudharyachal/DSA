import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                s=mid +1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

        } 
        int target = sc.nextInt();
        int x = binarySearch(arr,target);
        if(x==-1){
            System.out.print("elemt not found");
        }
        else{
            System.out.print(x);
        }
            
        
    }

}