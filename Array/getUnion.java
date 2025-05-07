package Array;

import java.util.*;

public class getUnion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] arr2={2,3,4,4,5,11,12};
        //        Approach (1)
        //        we have to think about the data structure which store unique element
//        and that is nothing but set
//        inserting key in map it will take logN times
//        Time complexity O((m+n)log(m+n))
//        Space Complexity O(m+n)
//        Approach (2)
//        by using hashmap
//        inserting key in map it will take logN times
//        Time complexity O((m+n)log(m+n))
//        Space Complexity O(m+n)
//        Approach (3)
//        by using two pointer
//        lets say i and j and that is pointing to the  Oth index
//        while traversing may encounter 3 condition
//        case 1)
//        arr[i]==arr[j] in this case you just have  insert only one element in two of them  i++or j++;
//        arr[i]<arr[j] insert arr[i] when last element in ansList is not equal arr[i] to  and i++;
//        arr[i]>arr[j]  insert arr[j] when last element in ansList is not equal  arr[j]to arr[1] and j++;
//        method3(arr,arr2);
    }
    public static void meathod1(int[] arr, int[] arr2){
        //        we have to think about  the data structure which store unique element
//        and that is nothing but set
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i< arr2.length;i++){
            set.add(arr2[i]);
        }
//        set.forEach(System.out::println);
        set.forEach(data-> System.out.print(data+" "));

    }
    public static  void meathod2(int [] arr1, int [] arr2){
        ArrayList<Integer> union= new ArrayList<>();
        Map<Integer,Integer> freq= new HashMap<>();
        for(int i=0;i< arr1.length;i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++){
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        }
        for(Integer i:freq.keySet()){
            union.add(i);
        }
        union.forEach(data-> System.out.println(data+" "));
    }

    public static void method3(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr2[j]) {
                ans.add(arr2[j]);
            }
            j++;
        }

        ans.forEach(data -> System.out.print(data + " "));
    }

}
