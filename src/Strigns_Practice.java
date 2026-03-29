//String Creation:
//👉 Create two strings using String literal and new String().
// Print them and compare using both == and .equals().

public class Strigns_Practice {
    public static void main(String[] args) {
        String a = "Arjun Khajuria";
        String b = new String("Arjun Khajuria");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

}
