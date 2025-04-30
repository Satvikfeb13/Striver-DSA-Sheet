package BasicMath;

public class Armstrong {
    public static boolean isArmstrong(int num){
        int k=String.valueOf(num).length();
        int original=num;
        int ans=0;
        while (num>0){
            int lastdigit=num%10;
            ans+=(int)Math.pow(lastdigit,k);
            num=num/10;
        }
        return original==ans;
    }
    public static void main(String[] args) {
        int num=371;
        if(isArmstrong(num)){
            System.out.println("This is Armstrong number");
        }else{
            System.out.println("This is Not a Armstrong number");
        }

    }
}
