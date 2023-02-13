public class PatternAlpha3 {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(c++);
            }
            System.out.println(" ");
        }
    }
}
