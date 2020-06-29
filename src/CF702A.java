import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF702A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        int[] data = new int[N];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; ++i) {
            data[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for (int i = 0, j = 1; i < N && j < N; ) {
            if (j == i) {
                j++;
            } else if (data[j - 1] >= data[j]) {
                i++;

            } else {
                j++;
            }
            ans = Math.max(ans, j - i);
        }
        if (data.length == 1)
            ans = 1;
        sb.append(ans).append("\n");
        System.out.print(new String(sb));
    }
}
