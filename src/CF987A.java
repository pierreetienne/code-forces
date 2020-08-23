import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CF987A {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String,String> gems = new HashMap<>();
        gems.put("purple","Power");
        gems.put("green","Time");
        gems.put("blue","Space");
        gems.put("orange","Soul");
        gems.put( "red","Reality");
        gems.put("yellow","Mind");

        String[] names = new String[gems.size()];
        int index = 0;
        for(String key: gems.keySet()){
            names[index++] = key;
        }
        boolean[] found = new boolean[gems.size()];
        int N = Integer.parseInt(in.readLine());
        int f = 0;
        for(int i=0;i<N;++i){
            String color = in.readLine();
            for(int j=0;j<names.length;++j){
                if(names[j].equals(color)){
                    found[j] = true;
                    f++;
                    break;
                }
            }
        }
        sb.append(gems.size()-f).append("\n");
        for(int i=0;i<gems.size();++i){
            if(!found[i]){
                sb.append(gems.get(names[i])).append("\n");
            }
        }
        System.out.print(new String(sb));
    }
}
