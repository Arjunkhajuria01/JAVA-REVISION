// Take an array of characters and build a full string using StringBuilder.append().

public class SB_Q1 {
    public static void main(String[] args) {
        char[] arr = {'L','e','e','t','C','o','d','e'};

        StringBuilder sb  = new StringBuilder();
        for(int i = 0; i<= arr.length -1; i++ ){
             sb.append(arr[i]);
        }
        System.out.println(sb.toString());

    }
}
