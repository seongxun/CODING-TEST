class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i=0;
        for(int num : num_list)
        {
            
            if(num_list[i]<0)
                answer = i;
            else{
                i++;
                continue;
            }
        }
        if(answer == 0 && i != 0)
            answer = -1;
        return answer;
    }
}