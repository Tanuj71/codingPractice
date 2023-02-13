public class FullPattern {
    public static void main(String[] args) {


    char c='a';
    char b='z';
    for (int i=0;i<10;i++){
        if(i%2==0){
            for (int j=0;j<i;j++){
                System.out.print(c++);
            }
        }else{
            for (int j=0;j<i;j++){
                System.out.print(b--);
            }
        }
        System.out.println(" ");
    }

    }
    }

