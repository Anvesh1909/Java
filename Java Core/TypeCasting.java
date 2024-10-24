public class TypeCasting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 12;

        b = (byte)a;

        System.err.println(b);

        float f = 4.5f;
        int x = (int)f;

        System.err.println(x);

    }
}
