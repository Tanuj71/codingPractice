
public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(112334));
    }

    public static int reverse(int num){

        int rev=0;
        while(num>0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        return rev;
    }

}

