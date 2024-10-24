
public class IntWapperClass {

    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; //auto bocking

        int num2 = num1.intValue(); // auto unboxing

        System.out.println(num2);

        String str = "123";
        int i = Integer.parseInt(str);

        System.out.println(i);
    }
    
}