import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF80A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[m + 51];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= m + 50; ++i) {
            for (int j = i * 2; j < m + 50; j += i) {
                prime[j] = true;
            }
        }
        for(int i=n+1;i<prime.length;++i){
            if(!prime[i] ){
                if(i==m)
                    sb.append("YES\n");
                break;
            }
        }
        if(sb.length()==0)
            sb.append("NO\n");

        System.out.print(new String(sb));

    }
}
