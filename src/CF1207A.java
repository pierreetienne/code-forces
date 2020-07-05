import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1207A {

    static int h, c;
    static int[][][] memo = new int[102][102][102];
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int b = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(in.readLine());
            h = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            for(int[][] x : memo){
                for(int[] y: x){
                    Arrays.fill(y, -1);
                }
            }
            int ans = f(b,p,f);
            sb.append(ans).append("\n");

        }
        System.out.print(new String(sb));
    }

    static int f(int b, int p, int f) {
        if(b>=0&&p>=0&&f>=0&&memo[b][p][f]!=-1)
            return memo[b][p][f];
        if (b >= 2 ) {
            int max = 0;
            if(p >0 ){
                max = f(b-2, p-1, f)+h;
            }
            if(f > 0 ) {
                max = Math.max(max, f(b-2, p, f-1)+c);
            }
            return memo[b][p<0?101:p][f<0?101:f]=max;
        }
        return 0;
    }
}
