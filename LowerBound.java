public class LowerBound {
    public static void main(String[] args) {
        int[] arr={2,2,2,3};
         int target=2;
         int start=0;
         int end=arr.length-1;
         int ans=-1;
         while(start<=end){
            // Mid will update every time
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                ans=mid+1;
                // because we have to find the lower bound  and i know their is no any lower bound on the right hand side
                end=mid-1;
            }
            // move to the right side 
            if(target>arr[mid]){
                start=mid+1;
            }
            // move to left side
            if(target<arr[mid]){
                end=mid-1;
            }
         }
         if(ans==-1){
            System.out.println("Element not found ");
         }else{
            System.out.println("Element found at index "+ans);
         }

    }
}
