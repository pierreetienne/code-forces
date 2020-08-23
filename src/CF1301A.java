import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1301A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            char[] a = in.readLine().toCharArray();
            char[] b = in.readLine().toCharArray();
            char[] c = in.readLine().toCharArray();

            boolean ws = true;
            for(int i = 0 ;i < a.length;i++){
                if(c[i] != a[i] && c[i] != b[i]){
                    sb.append("NO\n");
                    ws = false;
                    break;
                }
            }
            if(ws)
                sb.append("YES\n");
        }
        System.out.print(new String(sb));

    }
}
