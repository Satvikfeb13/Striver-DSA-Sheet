package Array;

public class FindMissing {
    public static int Summation(int [] arr){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int totalSum=(n*(n+1))/2;
        int ans=totalSum-sum;
        return (totalSum-sum)==0? arr.length+1:ans;
    }
    public static int xor(int[] arr){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<arr.length;i++){
            xor1^=arr[i];
        }
        for(int i=0;i<=arr.length;i++){
            xor2^=i;
        }
        int ans=xor1^xor2;
        return ans ==0? arr.length  +1:ans;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
//          Approach 1)
//         calculate arithmetic sum and sum of an array and subtract from it
//        System.out.println("Missing number from an array is "+Summation(arr));
//        Approach 2)
//        by using xor operator
//        calculate by using xor operator
        System.out.println("Missing number in an array "+xor(arr));



    }
}
