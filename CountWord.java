public class CountWord {


    public static void main(String[] args) {
        String str="Tanuj Gaur is the best";
        int c=1;
        for (int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) {
c++;

            }
        }
        System.out.println(c);
    }
}
