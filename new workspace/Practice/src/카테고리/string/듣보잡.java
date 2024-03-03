package 카테고리.string;

import java.io.*;
import java.util.*;

public class 듣보잡 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws Exception {
//        내가품();
        남이품();
    }
    static void 내가품()throws Exception{
        //Map이용
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map<String, Boolean> countMap = new HashMap<>();
        int count=0;

        for(int i=0;i<N;i++){
            String name = br.readLine();
            countMap.put(name, false);
        }
        for(int j=0;j<M;j++){
            String name = br.readLine();
            if(countMap.containsKey(name)) {
                countMap.put(name, true);
                count++;
            }
        }
        String[] names = new String[count];
        int i=0;
        for (Map.Entry<String, Boolean>entry:countMap.entrySet()){
            if(entry.getValue()) {
                names[i] = entry.getKey();
                i++;
            }
        }
        Arrays.sort(names, Comparator.naturalOrder());
        System.out.println(count);
        for (String name:names) System.out.println(name);
    }

    static void 남이품() throws Exception{
        // for문을 한 번 돌게 되어서 효율적임
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        String[] names = new String[N];
        for(int i=0;i<N;i++){
            names[i] = br.readLine();
        }
        Arrays.sort(names);

        String lastName = names[0];
        int count = 0;

        sb = new StringBuilder();
        for(int j=1;j<N;j++){
            String check = names[j];
            if(lastName.equals(check)){
                count++;
                sb.append(check).append("\n");
            }
            lastName = check;
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
