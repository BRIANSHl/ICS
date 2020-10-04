public class Java2dPRAC {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int rand = (int)(Math.random()*100);

                while (search(arr, rand)) {
                    rand = (int)(Math.random()*100);
                }
                arr[i][j] = rand;


            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[0].length; j++ ) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println(" ");
        }


    }

    public static boolean search(int[][] arr , int rand) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == rand) {
                    return true;
                }
            }
        }
        return false;
    }

}
