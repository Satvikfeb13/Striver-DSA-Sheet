package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateByK {
    public  static  void Reverse(int[] arr, int start, int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k=2;
        int n= 7;
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        Reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));


    }
}
