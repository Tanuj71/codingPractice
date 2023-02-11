public class MatrixBinarySearch {

    public static void main(String[] args) {
       int arr[][]={{1,2,3},
               {4,5,6}
       ,{7,8,9}};
        System.out.println(search(arr));
    }

    public static int search(int[][] arr){
        int key=0;
        int start=0;
        int n=arr.length-1;
        int m=arr[0].length;
        int end=(n*m)-1;
        while (start<=end){
            int mid=(start+(end-start)/2);
            if(arr[mid/m][mid%m]==key){
                return 1;
            } if(arr[mid/m][mid%m]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return 0;
    }
}
