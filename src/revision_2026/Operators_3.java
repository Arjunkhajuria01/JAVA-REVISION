package revision_2026;

public class Operators_3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(a+b);
       // System.out.println(a++);
        //System.out.println(++a);
        System.out.println(a == b);
        System.out.println(a <= b);
        System.out.println(a < b);
        System.out.println(a != b);
        System.out.println();

        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println();

        int d = 10 ;
        d += 5; // 10 +5 = 15
        d -= 3; // 15 -3 = 12
        d *= 2; // 12 * 2 = 24
        d /= 4 ; // 24 / 4 = 6

        System.out.println(d);
        System.out.println();

        int g = 5, h = 3;

        System.out.println(g & h); // AND
        System.out.println(g | h); // OR
        System.out.println(g ^ h); // XOR

        int v = 20;
        if (v % 3 == 0 && v % 5 == 0)
            System.out.println("DIvisibile by 3 and 5");
        else
            System.out.println("not divisible by 3 and 5");


    }
}
