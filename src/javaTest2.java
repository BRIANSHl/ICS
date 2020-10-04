import java.util.ArrayList;
import java.util.Scanner;


public class javaTest2 {

    public static void main(String[] args) {

        System.out.println("Please enter a range");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (arrayList.size() < 10) { // the scope is defined by the user
            int a = (int) (Math.random()*range) + 1; // this will generate number between RANGE every while loop

            if (!arrayList.contains(a)) { //if the program doesnt contain a anywhere, then add a
                arrayList.add(a);
            }
        }


    System.out.println(arrayList);

    }
}