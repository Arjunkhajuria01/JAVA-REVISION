// String builder.
public class SB_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // :- Empty
        StringBuilder xy = new StringBuilder("hello World"); // :- Initialized
        StringBuilder z = new StringBuilder(50); // :- With Capacity

        /*
        SOME IMPORTANT METHODS TO USE IN STRING BUILDER
         */
    // APPEND
        StringBuilder ar = new StringBuilder("Hi my name is ");
        ar.append("Arjun");
        System.out.println(ar);


    // INSERT   (Index , String)

        StringBuilder a = new StringBuilder("Hi my name is ");
        a.insert(14, "Arjun");
        System.out.println(a);


    // Delete (int start , int end)

        StringBuilder b = new StringBuilder("HI my name is arjun khajuria");
        b.delete(0,4);
        System.out.println(b);
        b.deleteCharAt(8);
        System.out.println(b);
        // or deletecharAt(int index) for single character deletion


    // REPLACE (int start , int end , String )

        StringBuilder c = new StringBuilder("HI MY NAME IS ARJUN");
        c.replace(0, 5 , "arjun"); // you can add string of any length
        System.out.println(c);


    // REVERSE

       StringBuilder d = new StringBuilder("HOLA COMU TALE TALE VOO") ;
       d.reverse();
        System.out.println(d);

    // CHAR AT

        StringBuilder e = new StringBuilder("HI MY NAME IS ARJUN");
        System.out.println(e.charAt(7));


    // SET CHAR AT  (index , char ch)

        StringBuilder f = new StringBuilder("HI MY NAME IS ARJUN");
        f.setCharAt(5 , 'X');
        System.out.println(f);


    // LENGTH

        StringBuilder g = new StringBuilder("HI my name is arjun") ;
        System.out.println(g.length());


    // toString  :- converts string builder to normal string

        // ALWAYS USE THIS BEFORE RUNNING A RESULT IN LEETCODE
        StringBuilder h  =new StringBuilder("Hi my name is arjun");
       String x =  h.toString();









    }
}
