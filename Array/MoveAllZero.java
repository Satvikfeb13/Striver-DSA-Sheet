package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZero {
    public static int[] move1(int[] arr){
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        int nz=list.size();
        for(int i=0;i<nz;i++){
            arr[i]=list.get(i);
        }
        for(int i=nz;i<arr.length;i++){
            arr[i]=0;
        }
        return  arr;
    }
    public  static  void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void move2(int[] arr){
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]!=0) {
                swap(arr,i,j++);
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
//        System.out.println(Arrays.toString(arr));
        move2(arr);
    }
}
