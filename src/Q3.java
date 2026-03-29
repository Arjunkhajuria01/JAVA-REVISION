// Check if a string is a palindrome.
public class Q3 {
    public static void main(String[] args) {
    String a = "jhaant";
    boolean x = false;
     char[] arj = a.toCharArray();

     for(int i = 0; i< arj.length  ; i++){
         if(arj[i] == arj[arj.length -1 -i]){
                x = true;

         }
     }
        System.out.println(x);
    }
}
