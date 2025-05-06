package Array;

public class LinearSearch {
    public static int search(int[] arr, int target){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                ans=i;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int target=234;
        int ans=search(arr,target);
        if(ans==-1){
            System.out.println("Ans will not found");
        }else{
            System.out.println(target+" is present at  index "+ans);
        }

    }
}
