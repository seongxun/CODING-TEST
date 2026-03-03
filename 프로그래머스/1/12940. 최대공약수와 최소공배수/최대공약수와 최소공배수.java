class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int l = 1;
        int g = 1;
        if(n >= m){
            for(int i = 1; i <= n; i++){       
                if(n % i == 0 && m % i ==0)
                    g = i;
            }
             answer[0] = g;
        }
        else{
            for(int i = 1; i <= m; i++){
                if(n % i == 0 && m % i == 0)
                    g = i;
            }
             answer[0] = g;
        }
            answer[1] = g * (n / g) * (m / g);
        return answer;
    }
}