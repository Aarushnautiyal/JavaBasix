package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 24, 56, 1, 23, 12, 6};
        int[] sorted = sort(arr);
        for (int num : sorted) {
            System.out.println(num);
        }

    }

    static int[] sort(int[] arr) {
        for (int i = arr.length-1;i>=0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

    }
}
