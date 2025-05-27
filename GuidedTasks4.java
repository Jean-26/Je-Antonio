public class GuidedTasks4 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int target = 4; 

        // 1. Modify the program to implement Selection Sort.
        selectionSort(arr);
        System.out.print("1. Sorted Array using Selection Sort: ");
        printArray(arr);

        // 2. Implement a Linear Search to find an element in an array.
        int linearIndex = linearSearch(arr, target);
        if (linearIndex != -1) {
            System.out.println("2. Linear Search: Element " + target + " found at index " + linearIndex);
        } else {
            System.out.println("2. Linear Search: Element " + target + " not found.");
        }

        // 3. Convert the Linear Search into a Binary Search.
        int binaryIndex = binarySearch(arr, target);
        if (binaryIndex != -1) {
            System.out.println("3. Binary Search: Element " + target + " found at index " + binaryIndex);
        } else {
            System.out.println("3. Binary Search: Element " + target + " not found.");
        }
    }

    // 1. Selection Sort Algorithm
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 2. Linear Search Algorithm
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // 3. Binary Search Algorithm (Requires sorted array)
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Not found
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
