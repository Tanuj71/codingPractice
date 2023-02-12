public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={1,10,5,6,3,0,8};
        sort(arr);
    }
    public static void sort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
