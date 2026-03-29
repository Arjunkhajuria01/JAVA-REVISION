// Reverse a given string without using built-in functions.
public class Q2 {
    public static void main(String[] args) {
        String a = "arjun is bhavans daddy";
        // convert strings to arrays
        char[] charray = a.toCharArray();

        for(int i = 0; i< charray.length /2 ; i++){
            char temp = charray[i];
            charray[i] = charray[charray.length -1 -i ];
            charray[charray.length - 1 -i] = temp;


        }
        System.out.println(charray);
    }
}
