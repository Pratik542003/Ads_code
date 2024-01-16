import java.util.Arrays;
import java.util.Random;

public class Random_Quick {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 10, 5, 4, 6, 2, 9, 3, 8, 7};

        // Record the start time
        long st = System.nanoTime();

        // Call the randomizedQuickSort function
        randomizedQuickSort(arr, 0, arr.length - 1);

        // Record the end time
        long end = System.nanoTime();

        // Print the sorted array and the execution time
        System.out.println(Arrays.toString(arr));
        System.out.println("Execution Time: " + (end - st) + " nanoseconds");
    }

    // Function to perform Randomized QuickSort
    public static void randomizedQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Choose a random pivot element using randomizedPartition
            int p = randomizedPartition(arr, low, high);

            // Sort the two partitions recursively
            randomizedQuickSort(arr, low, p - 1);
            randomizedQuickSort(arr, p + 1, high);
        }
    }

    // Function to perform Randomized Partition
    public static int randomizedPartition(int[] arr, int low, int high) {
        Random random = new Random();
        int r = random.nextInt(high - low + 1) + low;

        // Swap the random element with the last element and perform partition
        swap(arr, r, high);
        return partition(arr, low, high);
    }

    // Function to perform Partition
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Function to swap elements in the array
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
