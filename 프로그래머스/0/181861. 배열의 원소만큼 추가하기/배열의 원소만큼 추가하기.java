import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int cnt = 0;
        while(true)
        {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i];j++)
                    answer.add(arr[i]);
                cnt++;
            }
            if(cnt == arr.length)
                break;
        }
        return answer;
    }
}