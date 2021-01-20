import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  URL:https://codeforces.com/problemset/problem/1400/A
 *  STATUS:AC
 */
public class CF1400A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(in.readLine());
            String num = in.readLine();
            String sol = "";
            for (int i = 0,c = 0; i < n; ++i) {
                sol += num.charAt(i+c);
                c++;
            }
            System.out.println(sol);
        }
    }
}
