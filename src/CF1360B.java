import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1360B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[] data = new int[N];
            Integer last = null;
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < N; ++i) {
                data[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(data);
            for(int i=0;i<N;++i){
                if(last != null){
                    ans = Math.min(ans, data[i]-last);
                }
                last = data[i];
            }

            sb.append(ans).append("\n");
        }
        System.out.print(new String(sb));

    }
}
