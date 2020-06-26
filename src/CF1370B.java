import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class CF1370B {

    public static void main(String[] args) throws Exception {
        System.out.println(mcd(104,103));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int[] data = new int[n*2];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for(int i=0;i<data.length;++i){
                data[i] = Integer.parseInt(st.nextToken());

            }

            for(int i=0;i<data.length;++i){
                for(int j=i+1;j<data.length;++j){
                    List<Integer> numbers = new ArrayList<>();
                    List<Integer> index = new ArrayList<>();
                    for(int p=0;p<data.length;++p){
                        if(p != i && p != j){
                            numbers.add(data[p]);
                            index.add(p);
                        }
                    }

                    int min = -1;
                    for(int p=0,q=numbers.size()-1;p<q;++p,--q){
                        if(min == -1){
                            min = numbers.get(p)+numbers.get(q);
                        }else{
                            min = Math.min(min ,numbers.get(p)+numbers.get(q) );
                        }
                    }

                }
            }

//            for(int i=0;i<data.length;++i){
//                data[i][1] = Integer.parseInt(st.nextToken());
//                data[i][0] = i;
//            }
//            Arrays.sort(data,(a,b)-> a[1]-b[1]);
//            StringBuilder sb = new StringBuilder();
//            List<Integer> xx = new ArrayList<>();
//            for(int i=2,j=data.length-1;i<j;++i,j--){
//                xx.add(data[i][1]);
//                xx.add(data[j][1]);
//                sb.append(data[i][0]+1).append(" ").append(data[j][0]+1).append("\n");
//            }
//            System.out.println(xx);
//            System.out.println(new String(sb));
        }
    }

    static int mcd(int a, int b) {
        for (int t; b != 0; t = a % b, a = b, b = t) ;
        return a;
    }
}

