import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1095A {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        String data = in.readLine();
        String ans = "";
        if(N == 1)
            ans = data;
        else{
            int cont = 1;
            for(int i=0;i<data.length();){
                ans+=data.charAt(i);
                cont++;
                i+=cont;
            }
        }
        sb.append(ans).append("\n");

        System.out.print(new String(sb));
    }
}
