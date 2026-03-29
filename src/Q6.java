// Remove all whitespace from a string.
public class Q6 {
    public static void main(String[] args) {
        String name = "Arjun is bhavans daddy";
        char [] aar = name.toCharArray();

        for(int i = 0; i< aar.length ; i++ ){
            if(aar[i] == ' '){
                aar[i] = ' ';

            }
        }

        System.out.println(aar);
    }
}
