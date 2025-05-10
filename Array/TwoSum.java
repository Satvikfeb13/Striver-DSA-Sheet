package Array;

import java.util.Arrays;

public class TwoSum {
    public  static int[] bruteforcemeathod(int [] arr, int target){
       for(int i=0;i< arr.length;i++){
           for(int j=1;j< arr.length;j++){
               if(arr[i]+arr[j]==target){
                   return  new  int[]{i,j};
               }
           }
       }
       return  new int[]{-1,-1};
    }
    public static boolean twoPointer(int[] arr, int target){
//      firstly  sort the array
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int element=arr[start]+arr[end];
            if(element==target){
                return  true;
            }else if(element>target){
                end--;
            }else{
                start++;
            }
        }
        return  false;

    }
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
//        int[] ans=bruteforcemeathod(arr,target);
//        System.out.println(Arrays.toString(ans));
        if(twoPointer(arr,target)) System.out.println("Pair found");
        else System.out.println("Pair not found");

    }
}
