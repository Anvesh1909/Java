

class A{
    public A(){
        System.out.println("in A");
    }

    public A(String name){
        // to execute this constructer of same class
        this();
        System.out.println(name+"from A(String name)");
    }
}

class B extends A{
    public B(){
        //to call parameterized parent constructer
        super("anvesh");
        System.out.println("in B");
    }

    int add(int a,int b){
        return a+b;
    }
}
 

public class Inheritence {
    public static void main(String[] args) {
        B b = new B();
        b.add(1,2);
    }    
}
