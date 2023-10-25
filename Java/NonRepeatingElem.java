public class NonRepeatingElem {

    public static void nonRepeating(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 6, 9, 6, 8 };
        int n = arr.length;
        nonRepeating(arr, n);

    }

}