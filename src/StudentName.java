import java.util.Arrays;

public class StudentName { //program that puts marks in ascending order with student name
    /* Jeff - 81
       Dorothy - 90
       Meek mills - 83
       Jeffrey goldenstein - 67
     */
    public static void main(String[] args) {

        boolean flag = false;
        int[] grades = new int[] {81, 90, 83, 67};
        int temp = 0;
        while (flag ==false) {
            flag = true;
            int i = 0; //initilize
            for (int j = 0; j < grades.length - i - 1; j++) {
                if (grades[j] > grades[j+1]) {
                    temp = grades[j];
                    grades[j] = grades[j+1];
                    grades[j+1] = temp;
                    flag = false;
                }
            }
            i++; //add 1
        }

        String[] students = new String[] {"Jeff", "Dorothy", "Meek mills", "Jeffrey"};
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(grades));
    }
}
