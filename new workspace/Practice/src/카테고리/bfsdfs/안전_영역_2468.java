package 카테고리.bfsdfs;

import java.io.*;
import java.util.*;

public class 안전_영역_2468 {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, map[][], max;
    static boolean v[][];
    final static int[] dr = {-1,1,0,0};
    final static int[] dc = {0,0,-1,1};

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        Set<Integer> safe = new HashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int safeNum = Integer.parseInt(st.nextToken());
                map[i][j] = safeNum;
                safe.add(safeNum);
            }
        }

        max = 1; // 아무 지역도 물에 잠기지 않을 수 있다.
        for(int safeNum:safe){
            v = new boolean[N][N];
            int count = 0;
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(map[i][j]<=safeNum || v[i][j]) continue;

                    count++;
                    Queue<int[]> q = new ArrayDeque<>();
                    q.offer(new int[]{i,j});
                    v[i][j] = true;

                    while(!q.isEmpty()){
                        int[] rc = q.poll();
                        for (int d=0;d<dr.length;d++){
                            int nr = rc[0]+dr[d];
                            int nc = rc[1]+dc[d];

                            if(!isValidate(nr,nc)) continue;
                            if(v[nr][nc]) continue;
                            if(map[nr][nc]<=safeNum) continue;

                            q.offer(new int[]{nr,nc});
                            v[nr][nc] = true;
                        }
                    }
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
    static boolean isValidate(int r, int c){ return r >= 0 && c >= 0 && r < N && c <N; }
}