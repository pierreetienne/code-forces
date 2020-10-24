import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF1426A {
    public static void main(String[] args) throws  Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(String ln;(ln = in.readLine())!=null;){
            int C = Integer.parseInt(ln);
            while(C-->0){
                StringTokenizer st = new StringTokenizer(in.readLine());
                int N = Integer.parseInt(st.nextToken());
                int X = Integer.parseInt(st.nextToken());
                int val = 0, aux = (val*X)+2, floor = 1;
                while(aux < N){
                    val++;
                    aux = (val*X)+2;
                    floor++;
                }
                System.out.println(floor);
            }
        }
    }
}
