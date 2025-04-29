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
    static  void  Pattern14(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                char ch=(char)('A'+j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static  void  Pattern15(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                char ch=(char)('A'+j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void Pattern16(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                char ch=(char)('A'+i);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void Pattern17(int n){
        for (int i = 0; i < n; i++) {
//            spaces
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
//            char
            for (int k = 0; k <i+1 ; k++) {
                char ch=(char)('A'+k);
                System.out.print(ch);
            }
//            reverse
            for (int l = i-1; l >= 0; l--) {
                char ch= (char)('A'+l);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static  void Pattern18(int n){
        for (int i = 0; i < n; i++) {
            char ch= (char)('A'+n-1);
            for (int j=0;j<i+1;j++){
                System.out.print(ch+i);
            }
            System.out.println();
        }
    }
    static  void  Pattern19(int n){
        for (int i = 0; i < n; i++) {
//            star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<i*2;k++){
                System.out.print(" ");
            }
            for (int l=0;l<n-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < (2*n)-(2*i)-2; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l <i+1 ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void  Pattern20(int n){
//        for (int i = 0; i < n; i++) {
////            star
//            for (int j = 0; j <i+1 ; j++) {
//                System.out.print("*");
//            }
////            space
//            for (int k = 0; k < (n*2)-(2*i)-3; k++) {
//                System.out.print(" ");
//            }
////            star
//            for (int l = 0; l <i+1 ; l++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void  Pattern21(int n){
        for (int i = 0; i <n ; i++) {
          if(i==0 || i== n-1){
              for(int j=0;j<n;j++){
                  System.out.print("*");
              }
          }else{
              System.out.print("*");
              for (int k = 0; k < n-2; k++) {
                  System.out.print(" ");
              }
              System.out.print("*");
          }
            System.out.println();

        }
    }
    static  void  Pattern22(int n){
        int k = 4;
        int size = 2 * k - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print((k - min) + " ");
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
//        Pattern13(5);
//        Pattern14(5);
//        Pattern15(5);
//        Pattern16(5);
//        Pattern17(5);
//        Pattern18(5);
//        Pattern19(5);
//        Pattern20(5);
//        Pattern21(4);
        Pattern22(4);
    }


}
