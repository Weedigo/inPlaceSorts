public class helper {
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
}
