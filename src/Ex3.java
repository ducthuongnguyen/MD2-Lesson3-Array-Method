import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Gop mang
        int[] arr1 = new int[5];
        int[] arr2 = new int[3];
        int[] combine = new int[arr1.length+ arr2.length];
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap gia tri mang 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr1[i] = input.nextInt();
        }

        System.out.println("Nhap gia tri mang 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr2[i] = input.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            combine[i] = arr1[i];
        }
        int j=0;
        for (int i = arr1.length; i < combine.length; i++) {
            combine[i] = arr2[j];
            j++;
        }

        System.out.println("In mang gop:");
        for (int i = 0; i < combine.length; i++) {
            System.out.print(combine[i] + "\t");
        }
    }
}
