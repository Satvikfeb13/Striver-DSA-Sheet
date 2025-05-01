package Basic_Recursion;

public class PrintName {
    public static void printname(int n){
        if(n==0){
            return;
        }
        System.out.println("Satvik");
        printname(--n);
    }
    public static void printrev1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printrev1(n-1);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void print1ton(int i,int n){
        if(i>n) return;
        System.out.println(i);
        print1ton(i+1,n);
    }
    public static void main(String[] args) {
        print(5);
//        print1ton(1,5);

    }
}
