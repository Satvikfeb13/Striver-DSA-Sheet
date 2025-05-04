package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static  int[] merge(int[] arr){
        if(arr.length==1){
             return arr;
        }
        int mid= arr.length/2;
        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);
         return mergearr(left,right);
    }
    public static int [] mergearr(int[] first, int[] second){
        int[] mix= new  int[first.length+ second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return  mix;
    }
    public static void MergeSortInPlace(int[] arr, int s, int e){
        if(e-s<=1) {
            return;
        }
        int mid=s+(e-s)/2;
        MergeSortInPlace(arr,s,mid);
        MergeSortInPlace(arr,mid,e);
        merge(arr,s,mid,e);
    }
    public static void merge(int [] arr, int s, int m, int e){
        int[] mix= new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while (i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<m){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while (j<e){
            mix[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<mix.length;l++) {
            arr[s + l] = mix[l];
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,1,4};
        MergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));



    }
}
