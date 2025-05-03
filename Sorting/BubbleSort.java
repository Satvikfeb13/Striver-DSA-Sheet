package Sorting;

import java.util.Arrays;

public class BubbleSort {
//    it also known as sking sort and
    public static  void sort(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
//        Time complexity Best case when array is sorted O(n) n is size of array
//                        Worst case When array is in opposite order O(n^2)
    }
}
