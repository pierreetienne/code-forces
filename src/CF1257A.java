import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1257A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int realValueX = X;
            if(min > 1 && X > 0){
                X-= Math.min(X, min-1);
            }
            if( max < N && X > 0){
                X-= Math.min(X, N-max);
            }
            sb.append((max - min)+(realValueX-X) ).append("\n");
        }
        System.out.print(new String(sb));

    }
}
