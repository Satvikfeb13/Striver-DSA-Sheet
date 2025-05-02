package Hashing;

import java.util.Scanner;

public class Charr {
    public static void main(String[] args) {
        String s;
        Scanner scanne = new Scanner(System.in);
        s=scanne.next();
        int[] hash= new int[256];
        for(int i=0;i<s.length();i++){
            hash[(s.charAt(i))-'0']++;
        }
        int q;
        q=scanne.nextInt();
        while (q--!=0){
            char ch;
            ch= scanne.next().charAt(0);
            System.out.println(hash[ch-'0']);
        }

    }
}
