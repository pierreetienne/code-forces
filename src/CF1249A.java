import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1249A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            int[] data = new int[N];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; ++i) {
                data[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(data);
            int g = 1;
            for (int i = 1; i < N; ++i) {
                if(data[i-1]+1 == data[i]){
                    g=2;
                    break;
                }
            }
            sb.append(g).append("\n");
        }
        System.out.print(new String(sb));

    }
}
