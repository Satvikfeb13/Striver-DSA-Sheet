package Array;

import java.text.NumberFormat;
import java.util.Locale;

public class SingleElement {
    public static int getsingle(int[] arr){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1) return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1};
        System.out.println(getsingle(arr));
    }
}
