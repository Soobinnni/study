package 카테고리.string;

import java.io.*;
import java.util.*;
public class 단어정렬 {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        byStreamSort(); // 844ms
        bySort();       // 256ms
    }
    public static void byStreamSort() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        // 단어 받기
        for(int i=0;i<N;i++) words[i] = br.readLine();

        // distinct로 중복 제거, sorted로 정렬
        String[] sortedWords = Arrays.stream(words)
                .distinct()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .toArray(String[]::new);
        // 출력
        sb = new StringBuilder();
        for(String word:sortedWords) sb.append(word).append("\n");
        System.out.println(sb);
        br.close();
    }
    public static void bySort() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] words = new String[len];
        for (int i = 0; i < len; i++) words[i] = br.readLine();

        // 정렬
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) return s1.compareTo(s2);
                else  return s1.length() - s2.length();
            }
        });

        sb = new StringBuilder();
        // 출력(중복 제외)
        for (int j = 0; j < len; j++) {
            sb.append(words[j]).append("\n");
            while (j + 1 < len && words[j].equals(words[j + 1])) j++;
        }
        System.out.println(sb);
    }
}