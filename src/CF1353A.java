import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF1353A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 1)
                sb.append(0).append("\n");
            else if (N == 2) {
                sb.append(M).append("\n");
            }else {
                int[] data = new int[6];
                data[1] = (int) Math.floor(M/2.);
                data[3] = (int) Math.ceil(M/2.);
                int sum = 0;
                for(int i=0;i<data.length-1;i++){
                    sum += Math.abs(data[i]-data[i+1]);
                }
                sb.append(sum).append("\n");
            }
        }
        System.out.print(new String(sb));

    }
}
