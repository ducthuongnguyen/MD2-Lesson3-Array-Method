import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Delete element out of array
        int[] arr = {4, 5, 6, 7, 8, 22, 3, -7, 0, 0};
        Scanner input = new Scanner(System.in);


        System.out.println("Array before delete:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("Enter the element you want to delete:");
        int delElement = input.nextInt();
        int index_del = 0;

        for (int i = 0; i < arr.length; i++) {
            if (delElement == arr[i]) {
                index_del = i;
            }
        }

        System.out.println("Found the element in array. Array after delete.");

        for (int j = index_del; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }

        //Duyet lai mang sau khi xoa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
