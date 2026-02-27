class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num == 1)
            return answer;
        while(num != 1)
        {
            if(num%2 == 1)
            {
                num = num*3 +1;
                answer++;
            }
            else
            {
                num = num/2;
                answer++;
            }
        if(answer > 500)
            return -1;
        }
        return answer;
    }
}