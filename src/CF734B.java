import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF734B {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int min256 = Math.min(a, Math.min(c,d));
        int ans = min256*256;
        int a1 = a-min256;
        int min32 = Math.min(a1, b);
        if(min32 > 0){
            ans+=min32*32;
        }
        min32 = Math.min(a,b);
        a1 = a-min32;
        int ans2 = min32*32;
        min256 = Math.min(a1,Math.min(c,d));
        if(min256 > 0){
            ans2+=min256*256;
        }
        ans = Math.max(ans, ans2);
        sb.append(ans).append("\n");

        System.out.print(new String(sb));
    }
}
