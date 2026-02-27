class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;//약수 개수 셀 변수
        //number이하의 각 자연수들의 약수 개수 = n
        //만약 n > limit 이면 n = power, answer += power
        //그렇지 않으면 answer += n
        for(int i = 1;i<= number;i++)
        {
            cnt = 0;
            for(int j = 1;j * j <= i;j++){
            if(j * j == i)
                cnt++;
            else if(i % j == 0)
                cnt += 2;
            }
            if(cnt>limit)
                cnt = power;
            answer += cnt;
        }
        return answer;
    }
}