class Solution {
    public int[] solution(int start_num, int end_num) {
        int idx = end_num - start_num + 1;
        int[] answer = new int[idx];
        for(int i = 0;i < idx; i++)
        {
           answer[i] = start_num;
           start_num += 1;
        }
        return answer;
    }
}