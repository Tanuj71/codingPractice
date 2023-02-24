public class ShiftZeroes {

    public static void main(String[] args) {
        int[] arr={0,0,0,5,1,2,5,0,0,30,10};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }

        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

}
