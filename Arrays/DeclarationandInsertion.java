package Arrays;

import java.util.Arrays;
public class DeclarationandInsertion{
    public static void main(String[] args) {
        // This code is for Static array.
        // int [] arr part declares a block in ram saying hey we need an array.
        // new int[10] says hey that block of array that u initialise store reference to another block of memory for example x11
        // {X11,x12,x13....n} this x11 represents the memory block where the first value of array is stored
        // that is why the index of array starts from 0 as the arr block that is storing the refernce holds the first memory block 
        // so when we say arr[0] it transalates to arr[x11*0] which is where first value is.




        
        // int [] arr = new int[10]; First way is to declare an array with a size with n values.
        // second is to give all the values during initialisation
//        int [] arr = new int[] {2,3,4,5,6,7,8,9};
//        arr[2]=5;
//    int[][] arr = new int[2][2]{{1,2},{2,3}};
       int[] arr = new int[2];
    arr[0]=1;
    arr[1]=2;
        System.out.println(Arrays.toString(arr));
    }
}