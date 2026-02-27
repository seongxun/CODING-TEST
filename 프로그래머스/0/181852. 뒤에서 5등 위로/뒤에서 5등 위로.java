import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        Arrays.sort(num_list);
        int j=0;
        int cnt = 0;
        for(int i = 5;i<num_list.length;i++){
            answer[j] = num_list[i];
            j++;
        }
        while(answer[cnt] != 0)
        {
            cnt++;
        }
        int[] temp = new int[cnt];
        for(int i=0;i<cnt;i++)
        {
        temp[i] = answer[i];
        }
        return temp;
    }
}