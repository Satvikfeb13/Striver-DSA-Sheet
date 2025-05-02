package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] hash= new  int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        int q;
        q=scanner.nextInt();
        while (q--!=0){
            int num;
            num=scanner.nextInt();
            System.out.println(hash[num]);
        }
    }
}
