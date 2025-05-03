package Sorting;

import java.util.Arrays;

//we can acheive selection sort by using two  ways
//firstly find maximum one and replace with last value and so on and so forth
//Secondly find minimum one and replace with first value and so on and so forth
public class SelectionSort {
    public static int getmax(int arr[],int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void ssort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
        }

    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        ssort(arr);
        for(int index=0;index<arr.length;index++){
            System.out.print(arr[index]+" ");
        }
    }

}
