import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * URL:https://codeforces.com/problemset/problem/1409/A
 * STATUS:AC
 */
public class CF1409A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[] arr = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
            Arrays.sort(arr);
            int r = (int) Math.ceil((arr[1]-arr[0])/10.);
            System.out.println(r);
        }
    }
}
