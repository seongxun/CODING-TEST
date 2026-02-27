import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int[] temp;
        int cnt = 0;
        for(int i = 0;i < arr.length; i++)
        {
            if(arr[i]%divisor == 0)
            {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        if(cnt == 0){
         temp = new int[cnt+1]; 
         temp[0] = -1;   
        }
        else{
            temp = new int[cnt];
            for(int i = 0; i < cnt;i++)
            {
                temp[i] = answer[i];
            }
        }
        Arrays.sort(temp);
        return temp;
    }
}