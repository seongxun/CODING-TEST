class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = Integer.toString(a) + Integer.toString(b);         String sum2 = Integer.toString(b) + Integer.toString(a);         int int_sum1 = Integer.parseInt(sum1);
        int int_sum2 = Integer.parseInt(sum2);
        
        if(int_sum1>=int_sum2)
           answer = int_sum1;
        else
            answer = int_sum2;
        return answer;
    }
}