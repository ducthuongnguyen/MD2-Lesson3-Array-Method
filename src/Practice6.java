import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        //Dem so luong sinh vien thi do
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a mark for student" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("\n The number of sts passing the exam is: " + count);
    }
}
