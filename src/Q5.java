// Convert a string to uppercase without using toUpperCase().
public class Q5 {
    public static void main(String[] args) {
    String name = "Arjun Khajruia Is BhAvAns BIG daddy";

    char[] chname = name.toCharArray();

        for(int i = 0; i < chname.length; i++){
            if(chname[i] >= 'a' && chname[i] <= 'z'){
                chname[i] = (char) (chname[i] - 32);
            }

        }
        System.out.println(chname);
    }


    }

