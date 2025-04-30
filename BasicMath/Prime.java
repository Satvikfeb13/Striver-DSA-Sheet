package BasicMath;

public class Prime {
    public static boolean checkPrime(int n){
        boolean flag= true;
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
            }
        }
        return flag;
    }
    public static boolean checkPrime2(int n){
        boolean flag= true;
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(4));
        System.out.println(checkPrime2(4));


    }
}
