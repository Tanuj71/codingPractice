import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of arrya");
       int  n=sc.nextInt();
        System.out.println("ENter an array");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key");
        int key=sc.nextInt();
        System.out.println(linear(arr,key));
    }
    public static boolean linear(int [] arr,int key){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
}
