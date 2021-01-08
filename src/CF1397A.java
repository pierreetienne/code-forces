import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  URL:https://codeforces.com/problemset/problem/1397/A
 *  STATUS:AC
 */
public class CF1397A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            int[] letters = new int[40];
            for (int i = 0; i < N; ++i) {
                String w = in.readLine();
                for (int j = 0; j < w.length(); ++j) {
                    letters[w.charAt(j) - 'a']++;
                }
            }
            boolean sol = true;
            for (int i = 0; i < letters.length; ++i) {
                if (letters[i] % N != 0) {
                    sol = false;
                    break;
                }
            }
            System.out.println(sol?"YES":"NO");
        }
    }
}
