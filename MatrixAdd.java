public class MatrixAdd {

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        int[][] matrix1={ {2, 3, 4}, {5, 6, 4} };
        // Display current matrix
        display(matrix);
       display(matrix1);
        // Add the matrix
        int[][] add = new int[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                add[i][j] = matrix[i][j]+matrix1[i][j];
            }
        }

        // Display transposed matrix
        display(add);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
