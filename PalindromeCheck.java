public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }

    public static int palindrome(int num) {
        int check = num;
        int temp = 0;
        while (check != 0) {
            int digit = check % 10;
            temp = temp * 10 + digit;
            check = check / 10;
        }
        if (num == temp) {
            return 0;
        } else {

            return 1;
        }
    }

}
