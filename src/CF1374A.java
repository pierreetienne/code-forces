import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1374A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int mod = n%x;
            if(mod > y){
                n-=mod-y;
            }else if(mod < y){
                n-=x;
                n+=(y)-(n%x);
            }
            sb.append(n).append("\n");
        }
        System.out.print(new String(sb));
    }
}
