package Array;

import java.util.Arrays;

public class SortArray {
    public static void m1(int[] arr){
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public  static  void method2(int[] arr){
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                zeroCount++;
            else if (arr[i]==1)
                oneCount++;
            else
                twoCount++;
        }
        int index=0;
        while (zeroCount!=0){
            arr[index++]=0;
            zeroCount--;
        }
        while (oneCount!=0){
            arr[index++]=1;
            oneCount--;
        }
        while (twoCount!=0){
            arr[index++]=2;
            twoCount--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
//        Brute force approach
//        sorting
//        Sort the arr
//        m1(arr);
//        after sorting it will look like 0,0,1,1,2,2
//        Approach 2
//        This will be not a in place sort
//        Counting zero ,one and two and then
//        print one by one
//        method2(arr);
//        Approach 3
//        in place sort by using two pointer



    }
}
