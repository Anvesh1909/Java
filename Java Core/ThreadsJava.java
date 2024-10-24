public class ThreadsJava {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}


class A extends Thread{
    public void run(){
        for(int i = 0; i<100 ; i++)
        System.out.print("A");
    } 
}

class B extends Thread{
    public void run(){
        for(int i = 0; i<500 ; i++)
        System.out.print("B");
    } 
}


