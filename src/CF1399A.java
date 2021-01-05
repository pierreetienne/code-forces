import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *  URL:https://codeforces.com/problemset/problem/1399/A
 *  STATUS:AC
 */
public class CF1399A {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(in.readLine());
        while(C -- > 0){
            int N = Integer.parseInt(in.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for(int i=0;i<N;++i){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int max = 0;
            for(int i=1;i<N;++i){
                max = Math.max(max, Math.abs(arr[i-1] - arr[i]));
            }
            if(max > 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
