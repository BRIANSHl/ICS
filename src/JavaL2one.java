import java.util.Arrays;
import java.util.Scanner;

public class JavaL2one {
    public static void main(String[] args) {
        int[] arr = enterFromKeyboard();
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Your max is " + max + "and your min is " + min);


    }

    public static int[] enterFromKeyboard() {
        int counter;
        System.out.println("Enter 5 numbers");
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(kb.nextLine());
        }

        return arr;
    }

    public static int findMax(int[] arr) {
        int max;
        int counter = 1;
        max = arr[0];
        for (int j = 1; j < 5; j++) {
            if (arr[j] > max) {
                max = arr[j]; //if it swaps once, then the max for sure already appears once
                counter = 1;
            } else if (max == arr[j]) { //if it doesnt swap at all, because max already meets max, then occurence goes up 1
                counter++;
            }
        }

        System.out.println("Occurences of your max is" +counter);
        return max;
    }

    public static int findMin(int[] arr) {
        int min;
        min = arr[0];
        for (int j = 1; j < 5; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }

        }
        return min;
    }

}






