
public class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // Partition the array using the first element as pivot
            int pixd = partition(arr, start, end);

            // Recursively sort elements before and after partition
            quickSort(arr, start, pixd - 1); // Left side
            quickSort(arr, pixd + 1, end); // Right side
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start]; // First element as pivot
        int i = start + 1;
        int j = end;

        while (i <= j) {
            // Find element greater than pivot
            while (i <= end && arr[i] <= pivot) {
                i++;
            }
            // Find element smaller than pivot
            while (j >= start && arr[j] > pivot) {
                j--;
            }
            // Swap elements at i and j
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Swap pivot with element at j (correct position)
        swap(arr, start, j);

        return j; // Return pivot's final position
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 2, 3, 5, 8, 1 };
        print(arr);
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}