package BasicMath;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisor {
    public static  ArrayList<Integer> getAllDivisor(int num){
        ArrayList<Integer>list= new ArrayList<>();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
            list.add(i);
            }
        }
        return list;
    }
    public static ArrayList<Integer>getAllDivisorm2(int num){
        ArrayList<Integer>ans = new ArrayList<>();
        int i=1;
        while (i*i<num){
            if(num%i==0){
                ans.add(i);
                if(i!=num/i){
                    ans.add(num/i);
                }
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num=12;
        ArrayList<Integer> ans=getAllDivisorm2(num);
        System.out.println(ans);
    }
}
