import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1092B {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        int[] data = new int[N];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; ++i) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data);
        int ans = 0;
        for (int i = 1; i < N ; i+=2) {
            ans += data[i] - data[i-1];
        }
        sb.append(ans).append("\n");
        System.out.print(new String(sb));
    }
}
