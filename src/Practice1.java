import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //reverse array
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size = input.nextInt();
        if (size>20){
            System.out.println("Size does not exceed 20!!");
        }
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+ (i+1 +" :"));
            array[i]= input.nextInt();
        }
        //in mang da nhap
        System.out.print("Elements in array before reverse: "+" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
        //dao nguoc
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i]= temp;
        }

        //in ra mang reverse
        System.out.println("In mang reverse: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +"\t");
        }
    }

}
