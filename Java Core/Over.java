class A{
    public void shows(){
        System.out.println("A show");
    }
}

class B extends A{
    
    @Override
    public void shows(){
        System.out.println("B show");
    }
}


public class Over { 
    public static void main(String[] args) {
        B b = new B();
        b.shows();    
    }   
}
