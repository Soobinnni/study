package 카테고리.bfsdfs;

import java.io.*;
import java.util.*;

public class 단지번호붙이기_2667 {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, map[][];
    final static int[] dr = {-1,1,0,0};
    final static int[] dc = {0,0,-1,1};

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0;i<N;i++){
            String m = br.readLine();
            for(int j=0;j<N;j++){
                map[i][j] = m.charAt(j)-'0';
            }
        }

        // 1은 집有 0 無
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int cnt = 1;
                if (map[i][j] == 0) continue;
                Queue<int[]> q = new ArrayDeque<>();
                q.offer(new int[]{i,j});
                map[i][j] = 0;
                while (!q.isEmpty()) {
                    int ij[] = q.poll();
                    for(int d = 0; d < dr.length; d++) {
                        int newR = ij[0] + dr[d];
                        int newC = ij[1] + dc[d];
                        if (!isValidate(newR, newC)) continue;
                        if (map[newR][newC] == 0) continue;
                        q.offer(new int[] {newR, newC});
                        map[newR][newC] = 0;
                        cnt++;
                   }
               }
                pq.offer(cnt);
            }
        }
        sb.append(pq.size()).append("\n");
        while (!pq.isEmpty()) {
            sb.append(pq.poll()).append("\n");
        }
        System.out.println(sb);


//        List<Integer> complexCnt = new ArrayList<>();

//        while(true){
//            int count = countComplex();
//            if(count==0) break;
//            complexCnt.add(count);
//            total++;
//        }
//        complexCnt.sort(Integer::compare);

//        System.out.println(total);
//        for(int j=0;j<complexCnt.size();j++) System.out.println(complexCnt.get(j));
    }
//    static Deque<int[]> getStart(){
//        Deque<int[]> stack;
//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//                if(map[i][j]==1) {
//                    stack = new ArrayDeque<>();
//                    stack.addLast(new int[]{i,j});
//                    return stack;
//                }
//            }
//        }
//        return null;
//    }
//
//    static int countComplex(){
//        Deque<int[]> start = getStart();
//        if((start)==null) return 0;
//
//        int cnt = 1;
//        while (!start.isEmpty()){
//            int[] rc = start.removeLast();
//            map[rc[0]][rc[1]] = 0;
//            for(int i=0;i<dr.length;i++){
//                int nr = rc[0] + dr[i];
//                int nc = rc[1] + dc[i];
//
//                if(!isValidate(nr, nc)) continue;
//                if(map[nr][nc]==0) continue;
//
//                map[nr][nc] = 0;
//                cnt ++;
//                start.addLast(new int[]{nr, nc});
//            }
//        }
//        return cnt;
//    }
    static boolean isValidate(int r, int c){
        return r >= 0 && c >= 0 && r < N && c <N;
    }
}
