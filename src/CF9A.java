import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF9A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(in.readLine());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int min = Math.max(w, y);
        int p = 6 - min + 1;
        int q = 6;
        for(int i=2;i<=Math.max(q,p);++i){
            if(p%i == 0 && q%i==0){
                p/=i;
                q/=i;
                --i;
            }
        }

        sb.append(p+"/"+q).append("\n");
        System.out.print(new String(sb));
    }
}
