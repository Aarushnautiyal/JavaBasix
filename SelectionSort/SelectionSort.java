package SelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{13,24,56,1,23,12,6};
       int [] sorted = sort(arr);
       for (int num : sorted){
           System.out.println(num);
       }

    }
    static int[] sort (int[] arr){
        for(int i =0;i< arr.length;i++){
            int min =arr[i];
            int minIndx = i;
            for (int j = i; j < arr.length ; j++) {
                if(min>arr[j]){
                    min = arr[j];
                    minIndx= j;
                }
            }
            if(min!=arr[i]){
                int temp = arr[i];
                arr[i]= min;
                arr[minIndx] = temp;
            }
        }
        return arr;
    }
}
