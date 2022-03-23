import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Them phan tu vao mang
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;

        System.out.println("Before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter the number need to be added: ");
        int addNumber = input.nextInt();
        System.out.println("Enter the index need to be added:");
        int index_add = input.nextInt();
        if (index_add <= -1 || index_add >= arr.length) {
            System.out.println("Cannot insert element in the array.");
        } else {

            for (int i = arr.length - 1; i > index_add; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index_add] = addNumber;
            System.out.println("After:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
