package sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5, 62, 2, 3, 111, 81, 4};

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("After Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * <h1>Name: <font color="red">Quick Sort</font></h1>
     * <h3>Time Complexity: <font color="red">O(n log n)</font></h3>
     */
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1 , high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
