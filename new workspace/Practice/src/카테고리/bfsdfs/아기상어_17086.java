package 카테고리.bfsdfs;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;
public class 아기상어_17086 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N, M, map[][];
    static boolean v[][];
    final static int dx[] = {-1, 1, 0, 0, -1, -1, 1, 1}; //상하좌우 상좌 상우 하좌 하우
    final static int dy[] = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) throws Exception {
        input();
        int max = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                // q에 시작점 넣기
                if(map[i][j] == 1) continue;
                Queue<int[]> q = new ArrayDeque<>();
                q.offer(new int[] {i,j,0}); //시작 i, 시작j, 움직인 거리
                v = new boolean[N][M];
                // visited 넣기
                v[i][j] = true;

                out:
                while (!q.isEmpty()){
                    int ijd[] = q.poll();
                    for(int d=0; d<dx.length; d++){
                        int ni = ijd[0] + dx[d];
                        int nj = ijd[1] + dy[d];
                        if(!validate(ni,nj)) continue;
                        if(v[ni][nj]) continue;
                        if(map[ni][nj] == 1) {
                            max = Math.max(ijd[2]+1, max);
                            break out;
                        }
                        q.offer(new int[] {ni, nj, ijd[2]+1});
                        v[ni][nj]=true;
                    }
                }

            }
        }
        System.out.println(max);
    }

    static boolean validate(int i, int j){
        return i>=0 && j>=0 && i<N && j<M;
    }
    static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++)
            map[i] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

}
