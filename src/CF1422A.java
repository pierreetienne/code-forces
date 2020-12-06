import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1422A {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        for(String ln;(ln = in.readLine())!=null;){
            int T = Integer.parseInt(ln);
            while(T-->0){
                StringTokenizer st = new StringTokenizer(in.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int max = Math.max(a,Math.max(b,c))+1;
                System.out.println(max);
            }
        }

    }
}
