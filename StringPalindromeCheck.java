public class StringPalindromeCheck {


    public static void main(String[] args) {
        System.out.println(check("mam"));
    }

    public static boolean check(String str){
        char[] ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;


        while (start<=end){
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;


        }
        return true;
    }
}
