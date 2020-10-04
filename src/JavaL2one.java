import java.util.Arrays;
import java.util.Scanner;

public class JavaL2one {
    public static void main(String[] args) {
        int[] arr = enterFromKeyboard();
        int[] maxmin = findMax(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Your max is " + maxmin[0] + " and your min is " + maxmin[1]);


    }

    public static int[] enterFromKeyboard() {
        System.out.println("Enter 5 numbers");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();
        return arr;
    }

    public static int[] findMax(int[] arr) {
        int max, min = 0 ;
        int counter = 1;
        int counterb = 1;
        max = arr[0];
        for (int j = 1; j < 5; j++) {
            if (arr[j] > max) {
                max = arr[j]; //if it swaps once, then the max for sure already appears once
                counter = 1;
            } 
            else if (max == arr[j]) { //if it doesnt swap at all, because max already meets max, then occurence goes up 1
                counter++;
            }
            if (j==1){
                min = arr[j-1];
            }
            if(arr[j]<min){
                min = arr[j];
                counter = 1;
            }
            else if(min == arr[j]){
                counterb++;
            }
        }
        

        System.out.println("Occurences of your max is " +counter +". Occurences of your min is "+counterb +".");
        return new int[] {max,min};
    }

}






