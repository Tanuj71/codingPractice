import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        prime(arr);
    }
    public static void prime(int [] arr) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int n=1; n<=100; n++){
            int c = 0;
            for (int i = 1; i <= n; i++)
                if (n % i == 0)
                    c++;
            if (c == 2)
                a.add(n);
            else
                continue;
        }
        System.out.println(a);
    }
}
