package sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int nums[] = {5, 6, 2, 3, 1, 8, 4};

        System.out.println("Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        insertionSort(nums);

        System.out.println();
        System.out.println("After Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * <h1>Name: <font color="red">Insertion Sort</font></h1>
     * <h3>Time Complexity: <font color="red">O(n<sup>2</sup>)</font></h3>
     */
    private static void insertionSort(int[] arr) {

        int size = arr.length;
        int key = 0;
        int j = 0;

        for (int i = 1; i < size; i++) {
            key = arr[i];
            j = i - 1;

            System.out.println();
            for (int num : arr) {
                System.out.print(num + " ");
            }

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
