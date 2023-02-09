public class SwapNumber {
    public static void main(String[] args) {
        swap(50,100);
    }
    public static void swap(int num1,int num2){

//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;

        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("after swap"+num1+" "+num2);





    }
}
