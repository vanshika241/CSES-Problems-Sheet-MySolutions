package  introductory;
import java.util.Scanner;


public class WeirdAlgo {

    public static void  printAll(int n ){
        long ans = n;
        StringBuilder sb = new StringBuilder("");
        while (ans  != 1){
            sb.append(ans).append(' ');
            if (ans % 2 == 0){
                ans /= 2;
            }
            else{
                ans = ((3*ans)+1);
            }
        }
        sb.append(1);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAll(n);
    }
}
