public class NumberPattern3 {
    public static void printNums(int n)
    {
        int i, j;

        for(i=0; i<n; i++) // outer loop for rows
        {

            for(j=0; j<=i; j++) // inner loop for rows
            {
                // printing num with a space
                System.out.print(j+ " ");

                //incrementing value of num

            }

            // ending line after each row
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 5;
        printNums(n);
    }
}
