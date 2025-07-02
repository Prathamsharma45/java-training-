package add;

public class array {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1, 2, 3, 5, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
        }
        System.out.println(sum);

    }
}
