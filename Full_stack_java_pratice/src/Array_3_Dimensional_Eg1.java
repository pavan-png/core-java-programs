import java.util.Scanner;

public class Array_3_Dimensional_Eg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of collages ");
        int collages = sc.nextInt();
        System.out.println("enter the no of classes ");
        int classes = sc.nextInt();
        System.out.println("enter the no of students ");
        int students = sc.nextInt();
        int[][][] arr = new int[collages][classes][students];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("enter the marks of " + i + " collage " + j + " class and " + k + " student ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("-----------------------------total data entered is-------------------------------------------- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println(" marks of " + i + " collage " + j + " class and " + k + " student ");
                    System.out.println(arr[i][j][k]);

    }        }
        }
    }
}
