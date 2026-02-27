class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        int length = num_list.length;
        for(int i = 0;i<length;i++)
        {
            sum += num_list[i];    
        }
        sum *= sum;
        for(int i = 0;i<length;i++)
            mul *= num_list[i];
        
        if(sum > mul)
            return 1;
        return 0;
    }
}