package Array;

import java.util.Arrays;

public class SecondLargest {
    public static  int SecondLarge(int[] arr){
        int large=Integer.MIN_VALUE;
        int secLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }else if(arr[i]!=large && arr[i]>secLarge){
                secLarge=arr[i];
            }
        }
        return secLarge;

    }
    public static int approach1(int[] arr){
        if(arr.length==0 || arr.length==1) return -1;
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        int [] arr={1};
//        Approach (1)
//        this approach will work when there are no duplicate
//        sort the array in ascending order
//        the element present at the second index from the end that is the second-largest element
//        approach1(arr)
//        Time complexity O(NlogN), For sorting the array
//        System.out.println(approach1(arr));
//        Approach 2)
//        init two var large and second large
//        if current element is  larger than large the update second_Large and Large
//        else if the current element is larger than ‘second_Large’ then we update the variable second_large.
//        Return the second large
//        Time complexity -O(n) one single pass
//        Space complexity -O(1)

    }
}
