package Arrays;

import java.util.Arrays;

public class IteratingArray {
    public static void main(String[] args) {
        int[][] numberArray = new int[4][4];
        numberArray[0][0] = 1;
        numberArray[0][1] = 2;
        numberArray[0][2] = 3;
        numberArray[0][3] = 4;
        for(int[] num : numberArray){
            for(int innnerNum: num){
                System.out.println("nums are"+innnerNum);
            }
        }
    }
}
