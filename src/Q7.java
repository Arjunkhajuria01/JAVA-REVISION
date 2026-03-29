// Count the number of words in a string.
public class Q7 {
    public static void main(String[] args) {
        String name = "Arjun is ojusvis and bhavans daddy";
        int a = 1;
        char[] aar = name.toCharArray();

        for(int i = 0; i<= aar.length -1 ; i++){
            if(aar[i] == ' '){
                a++;

            }
        }
        System.out.println(a);
    }
}
