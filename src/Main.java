import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 *  URL:https://codeforces.com/problemset/problem/1399/A
 *  STATUS:AC
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());
        long[] s = new long[N];
        for (int i = 0; i < N; ++i) {
            s[i] = Integer.parseInt(st.nextToken());
            if (i > 0) {
                s[i] += s[i - 1];
            }
        }
        N = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            if(p > 0 ){
                sb.append(s[q]-s[p-1]);
            }else {
                sb.append(s[q]);
            }
            sb.append("\n");
        }
        System.out.print(new String(sb));
    }
}
