public class Ex5 {
    public static void main(String[] args) {
        //Tim min trong mang

        int[] arr = {4,5,6,7,2,3,4,99,-6,100};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min is " +min);
    }
}
