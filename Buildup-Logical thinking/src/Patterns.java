public class Patterns {
    static  void Pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void Pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static  void Pattern4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    static void Pattern5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static  void  Pattern6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void Pattern7(int n){
        for (int i = 0; i < n; i++) {
//            spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
//            Stars
            for (int k = 0;  k<i+1 ; k++) {
                System.out.print("*");
            }
            for (int l = i; l >0 ; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void Pattern8(int n){
        for (int i = 0; i < n; i++) {
//            space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            for(int l=n-i-1;l>0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void Pattern9(int n){
        for (int i = 0; i < n; i++) {
//            spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
//            Stars
            for (int k = 0;  k<i+1 ; k++) {
                System.out.print("*");
            }
            for (int l = i; l >0 ; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
//            space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            for(int l=n-i-1;l>0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void Pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + j) % 2);
            }
            System.out.println();
        }
    }
    static  void Pattern12(int n){
        for(int i=0;i<n;i++){
//            number
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
//            spaces
            for(int k=0;k<(2*n)-(2*i)-2;k++){
                System.out.print(" ");
            }
            for(int l=i+1;l>0;l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
    static  void Pattern13(int n){
     int var=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(var+" ");
                var++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
         int n=5;
//        Pattern1(5);
//        Pattern2(5);
//        Pattern3(5);
//        Pattern4(5);
//        Pattern5(5);
//        Pattern6(n);
//        Pattern7(n);
//        Pattern9(n);
//        Pattern10(5);
//        Pattern11(n);
//        Pattern12(5);
        Pattern13(5);
    }

}
