public class Practice5 {
    public static void main(String[] args) {
        //Find min in array by method
        int[] arr = {4, -1, 5, 6, 9, 0, -999};
        System.out.println("Min is " + minValue(arr));
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
