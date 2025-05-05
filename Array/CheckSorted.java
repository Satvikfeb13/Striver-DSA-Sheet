package Array;
public class CheckSorted {

    public static  boolean isSorted(int[] arr){
        boolean flag= true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i+1]>=arr[i]){

            }else{
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={13,14,15,16,17};
        System.out.println(isSorted(arr));
//        Approach 1)
//        Nested loop
//        if array size is zero or one  return -1;
//        Time complexity O(N^2)
//        Space complexity O(1)
//        Approach 2)
//        Single Traversal
//        We will check every element with its previous element
//        if the condition false then array is not sorted
//        else array is sorted
//        if array size is zero or one  return -1;
//        Time complexity O(n)
//        space complexity O(1)
    }
}
