package sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int nums[] = {6, 5, 2, 8, 9, 4};

        System.out.println("Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        selectionSort(nums);

        System.out.println();
        System.out.println("After Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * <h1>Name: <font color="red">Selection Sort</font></h1>
     * <h3>Time Complexity: <font color="red">O(n<sup>2</sup>)</font></h3>
     */
    private static void selectionSort(int[] nums) {

        int size = nums.length;
        int temp = 0;
        int minIndex = 0;
        for (int i = 0; i < size - 1; i++) {

            minIndex = i;
            for (int j = i + 1; j < size; j++) {

                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }
}
