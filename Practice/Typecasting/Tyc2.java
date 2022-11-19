import javax.annotation.processing.SupportedOptions;

//explicit type casting 

public class Tyc2 {
    public static void main(String[] args) {
        double a = 78.00;
        float b = (float) a;
        System.out.println(b); // 78.0

        float c = 9.6f;
        long d = (long) c;
        System.out.println(d); // 9

        long e = 12345698;
        int f = (int) e;
        System.out.println(e); // 12345698

        int g = 45;
        short h = (short) g;
        System.out.println(g); // 45

        short i = 12;
        byte j = (byte) i;
        System.out.println(j); // 12

        int k = 97;
        char l = (char) k;
        System.out.println(l); // a

        double m = 78.96;
        char n = (char) m;
        System.out.println(n); // N

        long o = 789634;
        byte p = (byte) o;
        System.out.println(p); // -126

    }

}
