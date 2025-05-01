package Basic_Recursion;

public class SumOfNumber {
    public static int iterative_sum(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        return sum;
    }
    public static int sum2(int n){
        return n*(n+1)/2;
    }
    public static void sum3(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum3(i-1,sum+i);
    }
    public static int sum4( int n){
        if(n==0){
            return 0;
        }
        return  n + sum4(n-1);

    }
    public static void main(String[] args) {
        int num=10;
        System.out.println("sum of n number "+iterative_sum(num));
        System.out.println("sum of n number "+sum2(num));
        sum3(num,0);
        System.out.println(sum4(10));



    }
}
