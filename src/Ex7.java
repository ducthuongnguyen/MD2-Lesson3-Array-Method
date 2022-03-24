import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //tinh tong hai duong cheo chinh trong ma tran vuong
        int[][] arr = {{45, 6, 2},
                       {5, 6, 7},
                       {-5, 8, 48}};

        int sumRightCross = 0;
        int sumLeftCross = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sumRightCross += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    sumLeftCross += arr[i][j];
                }
            }
        }
        System.out.print("Sum right is: " + sumRightCross + "\n");
        System.out.print("Sum left is: " + sumLeftCross + "\n");
    }
}
