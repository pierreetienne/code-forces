import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1180A {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        int[] data = new int[N+1];
        data[0]=1;
        for(int i=1;i<=N;++i){
            data[i] = data[i-1] + (4*i);
        }

        sb.append(data[N-1]).append("\n");
        System.out.print(new String(sb));
    }
}
