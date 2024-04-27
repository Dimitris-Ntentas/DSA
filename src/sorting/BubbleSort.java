package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int nums[] = {6, 5, 2, 8, 9, 4};

        System.out.println("Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        bubbleSort(nums);

        System.out.println();
        System.out.println("After Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /**
     * <h1>Name: <font color="red">Bubble Sort</font></h1>
     * <h3>Time Complexity: <font color="red">O(n<sup>2</sup>)</font></h3>
     */
    private static void bubbleSort(int[] nums) {

        int size = nums.length;
        int temp = 0;
        for (int i = 0; i <  size - 1; i++) {

            // Last i elements are already sorted - every i iteration the largest element will be at the end
            for (int j = 0; j < size - i - 1; j ++) {

                if (nums[j] > nums[j + 1]) {

                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }
}
