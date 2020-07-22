import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF265A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(String ln;(ln = in.readLine())!=null;){
            String step = in.readLine();
            int index = 0;
            for(int i=0;i<step.length();++i){
                if(ln.charAt(index)== step.charAt(i)){
                    index++;
                }
            }
            System.out.println(index+1);
        }

    }
}
