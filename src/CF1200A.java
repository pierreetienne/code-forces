import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF1200A {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (String ln; (ln = in.readLine()) != null; ) {
            Integer.parseInt(ln);
            String data = in.readLine();
            boolean[] rooms = new boolean[10];

            for (int i = 0; i < data.length(); ++i) {
                char a = data.charAt(i);
                if (a == 'L') {
                    for(int j=0;j<rooms.length;++j){
                        if(!rooms[j]){
                            rooms[j] = true;
                            break;
                        }
                    }
                }else if( a == 'R') {
                    for(int j=rooms.length-1;j>=0;--j) {
                        if(!rooms[j]){
                            rooms[j] = true;
                            break;
                        }
                    }
                }else{
                    int num = a-'0';
                    rooms[num] = false;
                }
            }

            for(int i=0;i<rooms.length;++i){
                if(rooms[i])
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }

    }
}
