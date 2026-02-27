import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        
        boolean[] visited = new boolean[N];//방문여부를 저장하는 배열
        int[] costs = new int[N]; // 0 1 2 3 4 ... N-1 -> 각 노드들까지의 최소 경로 저장 배열
        Arrays.fill(costs, Integer.MAX_VALUE);//최소 경로 값들을 무한대로 초기화

        int startNode = 0;//1번 마을에서 출발하므로 출발 노드를 1번 노드로 설정
        costs[startNode] = 0;

        for (int i = 0; i < N - 1; i++) {
            
            int minNode = findMinNode(costs, visited);//findMinNode메소드에 cost와 visited 전달을 통해 방문되지 않는 노드중 가장 작은 cost값을 가지는 노드를 반환받음
            visited[minNode] = true;//반환받은 노드를 방문 처리

            for (int[] edge : road) {
                int from;
                int to;
                int cost;
                from = 0;
                to = 0;
                cost = 0;

                //
                if (minNode == edge[0]-1) {
                    from = edge[0]-1;
                    to = edge[1]-1;
                    cost = edge[2];
                } else if (minNode == edge[1]-1) {
                    from = edge[1]-1;
                    to = edge[0]-1;
                    cost = edge[2];
                }

                if (!visited[to] && from == minNode && costs[from] + cost < costs[to]) {
                    costs[to] = costs[from] + cost;
                }
            }
        }
        
        // 최단거리가 k보다 작은 경우 구하기
        int answer = 0;
        for(int i=0; i<costs.length; i++) {
            if(costs[i] <= K) {
                answer += 1;
            }
        }
        
        return answer;
    }
    
    // 갈수있는 노드 중에서 제일작은 노드 찾기
    private int findMinNode(int[] costs, boolean[] visited) {
        int minCost = Integer.MAX_VALUE;//최소값을 무한대로 설정
        int minNode = -1;//최소값을 가지는 노드 초기화

        // 한번도 들어가지 않았다을 때
        for (int i = 0; i < costs.length; i++) {
            if (!visited[i] && costs[i] < minCost) { // 방문하지 않았고 값이 무한보다 작은경우
                minCost = costs[i];
                minNode = i;
            }
        }

        return minNode; // 거리값이 제일 작은 노드 인덱스 반환
    }
}
