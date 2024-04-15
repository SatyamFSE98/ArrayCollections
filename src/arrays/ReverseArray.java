package arrays;

public class ReverseArray {
     
    public static void reverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Print a newline after printing the reversed array
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline after printing the original array
        System.out.print("Reversed array: ");
        reverseArray(array);
    }
}
