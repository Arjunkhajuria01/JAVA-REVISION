//Write a program to count the number of vowels and consonants in a string.

public class Q1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
    String b = "my name is arjun im bhavans daddy";
    for(int a = 0; a<= b.length() -1 ; a++){
        if( b.charAt(a) == 'a' || b.charAt(a) == 'e' || b.charAt(a) == 'i' || b.charAt(a) == 'o' || b.charAt(a) == 'u' ){
            x++;
        }
        else {
            y++;
        }
    }
        System.out.println("The number of vowels are: " + x);
        System.out.println("The number of consonents are " + y);
    }
}
