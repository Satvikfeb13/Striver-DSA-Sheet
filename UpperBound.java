class UpperBound{
public static void main(String[] args){
    int[] arr={3,5,8,9,15,19};
    // we ca do this in two ways firstly linear search 
    int target=9;
    // Intilize target start and end
    int start=0;
    int end=arr.length-1;
     int ans=-1;
    while(start<=end){
    // Update on every iteration
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            ans=mid+1;
            start=mid+1;
    // Move to the right postion
        }else if(target>arr[mid]){
            start=mid+1;
    // Move to the left position
        }else{
            end=mid-1;
        }
    }
    if(ans==-1){
        System.out.println("Index not found at index "+ans);
    }else{
        System.out.println("Index found at index "+ans);
    }

}

}