import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class CF1367B {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(in.readLine());
            int[] data = new int[N];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for(int i=0;i<N;++i){
                data[i] = Integer.parseInt(st.nextToken());
            }
            int ans = -1;
            List<int[]> unorder = new ArrayList<>();
            int odd = 0;
            for(int i=0;i<data.length;++i){
                if(i%2 != data[i]%2){
                    odd += data[i]%2;
                    unorder.add(new int[]{i, data[i]});
                }
            }
            if(unorder.size() == 0)
                ans = 0;
            else if(odd*2 == unorder.size())
                ans = odd;

            sb.append(ans).append("\n");

        }
        System.out.print(new String(sb));
    }
}
