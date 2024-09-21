package ss3_array_method.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class LargestElementIn2DimensionalArray {

    public static void main(String[] args) {
        int[][] numbers = {{9, 7, 6}, {2, 5, 10}, {3, 8, 11}};
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("The largest number in the 2D array is " + max);
    }

}
