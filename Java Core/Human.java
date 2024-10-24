
class Details{
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Human {
    public static void main(String[] args) {
        Details A = new Details();
        A.setAge(22);
        A.setName("Anvesh");

        System.out.println(A.getAge());
        System.out.println(A.getName());

    }
}
