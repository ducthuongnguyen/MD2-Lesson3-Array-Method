import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //tinh tong cac so tai 1 cot trong mang 2 chieu

        int[][] arr = {{45, 6, 2},
                {5, 6, 7},
                {-5, 8, 48}};
        Scanner input = new Scanner(System.in);
        System.out.println("Total of column? ");
        int col = input.nextInt();
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == col-1){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.print("sum=== " +sum);
    }
}
