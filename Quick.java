public class Quick {

    static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partion(int arr[],int low,int high){
        int pi=arr[high];
        int i=(low-1);
        for (int j=low;j<high-1;j++){
            if (arr[j]<pi){
                i++;
                swap(arr,i,j);

            }
        }
        swap(arr,i+1,high);



        return (i+1);
    }
    static void sort(int[] arr,int low,int high){
        if (low<high){
            int p=partion(arr,low,high);
            sort(arr,low,p-1);
            sort(arr,p+1,high);
        }

    }
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
       int arr[]={1,5,8,9,3,0,1};
       sort(arr,0,arr.length-1);
       printArray(arr,arr.length);
    }
}
