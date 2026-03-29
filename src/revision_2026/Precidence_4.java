package revision_2026;

public class Precidence_4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        int result = a + b * c - b;
        System.out.println(result);

        int result2 = a++ + b++ + ++a + ++b;
        System.out.println(result2);

        int x = 10;
        int y = 5;
        //System.out.println(x > y && y++ < 10);
        // IMP :-
        // y++	Use first, then increase
        //++y	Increase first, then use
        int f = ++y;
        System.out.println(f);
    }
}
