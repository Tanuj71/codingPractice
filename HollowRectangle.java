import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hollow Rectangle Rows & Columns = ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        System.out.println("Printing Hollow Rectangle Star Pattern");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }


