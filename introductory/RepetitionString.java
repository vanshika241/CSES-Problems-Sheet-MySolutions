
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import  java.util.*;
public class RepetitionString {
    private static int findRepetition(String s){
        int n = s.length();
        int maxlen = 1;
        int len = 0;
        int i=0;
        while (i<n){
            char curr = s.charAt(i);
            len = 0;
            while (i<n && curr == s.charAt(i)){
                len++;
                i++;
            }
            maxlen = Math.max(maxlen , len);
        }
        return  maxlen;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        System.out.println(findRepetition(s));

    }
}
