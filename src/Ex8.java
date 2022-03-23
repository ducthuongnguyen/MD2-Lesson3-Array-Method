import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //Đếm số lần xuất hiện của ký tự trong chuỗi
        String str = "Welcome to my world.";
        int count = 0;
//        char c = 'o';
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = input.nextLine().charAt(0);
        System.out.print(c);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c) {
                count++;
            }
        }
        System.out.println("Char " + c + " appears " + count + " times.");
    }
}
