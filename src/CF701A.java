import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF701A {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        int[][] data = new int[N][2];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for(int i=0;i<N;++i){
            data[i][1]=i+1;
            data[i][0]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(data,(a, b)-> a[0]-b[0]);
        for(int i=0,j=N-1;i<j;++i,--j){
            sb.append(data[i][1]+ " " + data[j][1]).append("\n");
        }


        System.out.print(new String(sb));

    }
}
