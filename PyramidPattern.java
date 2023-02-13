public class PyramidPattern {


    public static void main(String[] args) {
        pyramidPattern(10);
    }

    public static void pyramidPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" "); //print space
            }
            for (int j = 0; j <= i; j++) //inner loop for number of columns
            {
                System.out.print("* "); //print star
            }

            System.out.println(); //ending line after each row
        }
    }
}

