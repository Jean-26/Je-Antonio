import java.util.Scanner;

public class SelfPractice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Accept user input for an array
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
        }

        // 2. Implement Insertion Sort on an array of strings
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.print("Sorted Array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }

        scanner.close();
    }
}
