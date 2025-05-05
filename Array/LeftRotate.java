package Array;

import java.util.Arrays;

public class LeftRotate {

    public  static void fun(int[] arr, int n){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=5;
        fun(arr,n);
        System.out.println(Arrays.toString(arr));

    }
}
