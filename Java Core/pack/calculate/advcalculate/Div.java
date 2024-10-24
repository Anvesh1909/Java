package pack.calculate.advcalculate;

public class Div {
    public static double div(double a, double b){
        if(b==0){
            System.out.println("division by zero not possible");
            return 0;
        }
        return a/b;
    }
}
