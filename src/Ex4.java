public class Ex4 {
    public static void main(String[] args) {
        //Tìm phần tử lớn nhất trong mang hai chiều
        double[][] matrix = {{999, 4.05, 5, 7},
                             {66, -9, 0, 6},
                             {77.99, 78, 2, 1}};
        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Max is: " + max);
    }
}
