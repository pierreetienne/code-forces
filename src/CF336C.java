import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CF336C {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        int[] d = new int[T];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < T; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }
        int[] pows = new int[31];
        for (int i = 0; i < pows.length; ++i) {
            pows[i] = 1 << i;
        }
        Arrays.sort(d);
        int indexBinary = -1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < d.length; ++i) {
            int binary = Arrays.binarySearch(pows, d[i]);
            if(binary < 0 )
                binary = -binary - 2;
            if(binary >= 0){
                indexBinary = binary;
            }

            if(indexBinary != -1){
                if(map.get(indexBinary)== null)
                    map.put(indexBinary, new ArrayList<>());
                map.get(indexBinary).add(d[i]);
            }
        }

        Integer k = null;
        for(Integer key: map.keySet()){
            if(k == null){
                k = key;
            }
            if(k < key){
                k = key;
            }

        }
        System.out.println(map);
        if(k != null) {
            List<Integer> res = map.get(k);
            System.out.println(res.size());
            for(int i=0;i<res.size();++i){
                if(i==0){
                    System.out.print(res.get(i));
                }else{
                    System.out.print(" "+res.get(i));
                }
            }
            System.out.println();
        }
        else
            System.out.println(-1);

    }


    public static boolean pow2(int[] pows, int val) {
        for (int i = 0; i < pows.length; ++i) {
            if (val == pows[i])
                return true;
        }
        return false;
    }
}
