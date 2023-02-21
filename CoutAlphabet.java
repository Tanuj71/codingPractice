public class CoutAlphabet {


    public static void main(String[] args) {
        String str="Pankaj choudhary";
        char[] ch=str.toCharArray();
        int count=0;
        for (int i=0;i<ch.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
