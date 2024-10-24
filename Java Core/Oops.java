class A{
    int a = 10;

    static String name;
    String brand;
    int price;

    static{
        name = "Phone";
    }
    
    public A(){
        brand = "";
        price = 200;
    }

    int add(int a , int b){
        return a+b;
    }
}

public class Oops {
    public static void main(String[] args) {
        int num1 = 4, num2 = 5;

        int res = num1 + num2;

        System.err.println(res);

        A a1 = new A();
        res = a1.add(num1, num2);
        System.err.println(res);

    }
}
