// Remove all vowels (a, e, i, o, u) from a string.

public class SB_Q2 {
    public static void main(String[] args) {
        String s = "beautiful";
    StringBuilder sb = new StringBuilder();

       for(int i = 0; i<= s.length() -1 ; i++ ){
           if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){

           }
           else {
               sb.append(s.charAt(i));
           }
        }
        System.out.println(sb);
    }
}
