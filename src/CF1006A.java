import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1006A {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());

        for(int i=0;i<N;++i){
            int val =Integer.parseInt(st.nextToken());
            if(val%2==0)
                val--;
            if(i==0)
                sb.append(val);
            else
                sb.append(" "+val);
        }
        sb.append("\n");

        System.out.print(new String(sb));

    }
}
