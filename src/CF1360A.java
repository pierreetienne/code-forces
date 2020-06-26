import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1360A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int min = Math.min(A,B);
            int max = Math.max(A,B);
            int sideA = min*2;
            int ans = 0;
            if(sideA >= max){
                ans = sideA*sideA;
            }else{
                ans = max*max;
            }
            sb.append(ans).append("\n");

        }
        System.out.print(new String(sb));
    }
}
