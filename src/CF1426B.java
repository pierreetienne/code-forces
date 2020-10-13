import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1426B {
    public static void main(String[] args) throws  Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(String ln;(ln = in.readLine())!=null;){
            int A = Integer.parseInt(ln);
            while(A-->0){
                StringTokenizer st = new StringTokenizer(in.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                boolean ok = false;
                for(int i=0;i<N;++i){
                    st = new StringTokenizer(in.readLine());
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    st = new StringTokenizer(in.readLine());
                    int c = Integer.parseInt(st.nextToken());
                    int d = Integer.parseInt(st.nextToken());
                    if(b == c )
                        ok = true;
                }
                if(ok) {
                    if(M%2!=0){
                        ok = false;
                    }
                }
                System.out.println(ok?"YES":"NO");

            }
        }

    }
}
