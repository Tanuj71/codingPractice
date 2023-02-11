public class CountCharacter {
    public static void main(String[] args) {
        String someString = "elephant eee";
        System.out.println(count(someString));
    }
    public static int count(String str){

        char someChar = 'e';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar ) {
                count++;
            }
        }
        return count;
    }
}
