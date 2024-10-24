package pack.calculate.advcalculate;

public class Mul {
    public static int mul(int a,int b){
        return a*b; 
    }

    public static int pow(int a, int b){
        for(int i=1;i<=b;i++){
            a*=a;
        }
        return a;
    }

}
