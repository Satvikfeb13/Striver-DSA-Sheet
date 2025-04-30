package BasicMath;

public class Palindrome {
    public  static  boolean checkpalindrome(int n){
        int original=n;
        int ans=0;
        while(n>0){
            int last=n%10;
            ans=ans*10+last;
            n/=10;
        }
        return original==ans;
    }
    public static void main(String[] args) {
        int num=12321;
        if(checkpalindrome(num)){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
