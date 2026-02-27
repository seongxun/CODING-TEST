class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        Integer sum = 0;
        Integer temp = x;
        while(x>=10)
        {
            sum += x%10;
            x = x/10;
        }
        sum += x;
        if(temp % sum == 0)
            answer = true;
        else
            answer = false;
        return answer;
    }
}