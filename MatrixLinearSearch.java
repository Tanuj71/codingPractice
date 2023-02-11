public class MatrixLinearSearch {


    public static void main(String[] args) {
        int arr[][]={{12,32,33},{54,10,87},{77,87,99}};
        System.out.println(search(arr));
    }
    public static int search(int[][] arr){

        int key=10;
        int n=arr.length-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]==key){
                    return 1;
                }
            }
        }

        return 0;
    }
}
