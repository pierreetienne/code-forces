import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1300A {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        while(N-->0){
            int T = Integer.parseInt(in.readLine());
            StringTokenizer st= new StringTokenizer(in.readLine());
            int[] data = new int[T];
            int countZeros = 0;
            int sum = 0;
            for(int i=0;i<T;i++){
                data[i] = Integer.parseInt(st.nextToken());
                if(data[i]==0){
                    countZeros++;
                }
                sum += data[i];
            }
            int ans = 0;
            if(countZeros > 0){
                sum+=countZeros;
                ans+=countZeros;
            }
            if(sum==0){
                ans+=1;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(new String(sb));

    }
}
