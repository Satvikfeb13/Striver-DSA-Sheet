package BasicMath;

public class GCD_Of_Num {
    public  static  int gcdm1(int num1,int num2){
        int ans=1;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if((num1%i==0) && (num2%i==0)){
                ans=i;
            }
        }
        return  ans;
    }
    public  static  int gcdm2(int m1, int m2){
        if(m1==0){
            return m2;
        }
        return gcdm2(m2%m1,m1);
    }
    public static void main(String[] args) {
        int num1=20;
        int num2=15;
        System.out.println("Gretest comman divisor  is "+gcdm1(num1,num2));
        System.out.println(gcdm2(num1,num2));

    }
}
