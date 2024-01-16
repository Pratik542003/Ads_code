import java.util.*;

public class Lab_Quick {
    // Function to swap elements in the array
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Function to perform partitioning in the QuickSort algorithm
    public static int partition(int[] arr, int low, int high) {
        // Choose the pivot element (in this case, the element at 'high')
        int pivot = arr[high];
        int i = low - 1;

        // Iterate through the array, rearranging elements around the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap elements if they are less than or equal to the pivot
                swap(arr, i, j);
            }
        }

        // Swap the pivot element to its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Recursive function to perform QuickSort
    public static void Sort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and sort the two partitions recursively
            int p = partition(arr, low, high);
            Sort(arr, low, p - 1);
            Sort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 5, 4, 6, 2, 9, 3, 8, 10, 7};

        // Record the start time
        long st = System.nanoTime();

        // Call the Sort function (QuickSort)
        Sort(arr, 0, arr.length - 1);

        // Record the end time
        long end = System.nanoTime();

        // Print the sorted array and the execution time
        System.out.println(Arrays.toString(arr));
        System.out.println("Execution Time: " + (end - st) + " nanoseconds");
    }
}
