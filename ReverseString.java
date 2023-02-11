public class ReverseString {

    public static void main(String[] args) {
        reverseString("TANUJGAUR");
    }
    public static void reverseString(String str){
        char[] ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;

        while (start<=end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        System.out.println("After the logic");
        for (int i=0;i<ch.length;i++ ){
            System.out.println(ch[i]);
        }
    }
}
