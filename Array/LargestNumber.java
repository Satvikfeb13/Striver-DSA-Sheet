package Array;

import java.util.Arrays;

public class LargestNumber {
    public static int getlarge(int[] arr){
        int large=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>=large){
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[] arr= {12,13,14,15,16};
//        Approach 1)
//        sort() and return last element
//        Arrays.sort(arr);
//        Time complexity O(N* log(N))
//        Space complexity O(1)
//        System.out.println("Largest element in array is "+arr[arr.length-1]);
//        Approach 2)
//        initially  variable max consider first element is large element and
//        check every element is  that element is greater than that or not
//        Time complexity O(N)
//        Space Complexity O(1)
//        System.out.println("Largest element in an array is "+getlarge(arr));

    }
}
