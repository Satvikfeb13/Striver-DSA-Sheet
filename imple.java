public class imple {
    public static void main(String[] args) {
        int[] arr={3, 4, 6, 7, 9, 12, 16, 17};
        int target=17;
        int start=0;
        int ans=-1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                ans=mid;
                break;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        if(ans==-1) System.out.println("Element not found");
        else System.out.println("element found at index "+ ans);
    }
}
