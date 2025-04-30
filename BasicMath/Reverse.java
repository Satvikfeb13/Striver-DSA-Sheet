package BasicMath;

public class Reverse {
    public  static int reverse(int num){
        int ans=0;
        while (num!=0){
            int last= num%10;
            ans=last+ans*10;
            num/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num=-12345;
        System.out.println(reverse(num));


    }
}
