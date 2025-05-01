package Basic_Recursion;

public class Factorial {
    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }

    public static int fact2(int num) {
        if(num<=1){
            return 1;
        }
        return  num*fact2(num-1);
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("Factorial of a number "+ fact(5));
        System.out.println("Factorial of a number  using recursion "+fact2(num));

    }
}
