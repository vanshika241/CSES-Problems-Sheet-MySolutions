package introductory;
import java.io.*;
import java.util.*;

public class MissingNumber {

    static int findMissing(int[] arr, int n) {
        int len = n - 1;
        int i = 0;
        while (i < len) {
            int correctIdx = arr[i] - 1;
            if (correctIdx >= 0 && correctIdx < len && arr[i] != arr[correctIdx]) {
                int temp = arr[correctIdx];
                arr[correctIdx] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (int id = 0; id < len; id++) {
            if (arr[id] - 1 != id) {
                return id + 1;
            }
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int[] arr = new int[n - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(findMissing(arr, n));
    }
}