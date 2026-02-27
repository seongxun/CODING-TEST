class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int i = 0;
        for(i=0;i<num_list.length;i++)
        {
            if(i<n)
                answer[num_list.length-n+i] = num_list[i];
            else
                answer[i-n] = num_list[i];
        }
        return answer;
    }
}