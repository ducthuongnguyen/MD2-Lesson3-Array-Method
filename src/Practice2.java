import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //Find element in array
        String[] students = {"Thuong", "Hue", "Huong", "Phong", "Manh"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's name:");
        String name = input.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the student named " + name + " is: " + i);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Not found " + name + " in the list!! Please recheck.");
        }
    }
}

