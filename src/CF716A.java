import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF716A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int count = 1;
        int last = -1;
        for (int i = 0; i < N; ++i) {
            int s = Integer.parseInt(st.nextToken());
            if (i > 0) {
                if (s - last <= C) {
                    count++;
                } else {
                    count = 1;
                }

            }
            last = s;
        }
        sb.append(count).append("\n");
        System.out.print(new String(sb));

    }
}
