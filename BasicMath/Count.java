package BasicMath;

public class Count {
    public   static int countnumber(int num){
//        init count to store
//         the total count
        int count=0;
        while(num>0){
//            int lastnum=num%10;
//            count increase for each  digit
            count++;
//            divide n by 10 and remove last digit
            num/=10;
        }
//        return the total countx
        return count;
    }
    public static void main(String[] args) {
        int num=1236;
        System.out.println(countnumber(num));
//        using log method
        System.out.println(Math.log10(num)+1);
    }
}
