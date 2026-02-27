import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str1 = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int i = str1.length();
        long[] arr = new long[i];
        int temp = 0;
        for(int j = 0; j < i ; j++)
        {
            arr[j] = str1.charAt(j) - '0';
        }
        Arrays.sort(arr);
        for(int j = i - 1; j >=0; j--)
        {
            sb.append(arr[j]);
        }
        str1 = sb.toString();
        answer = Long.parseLong(str1);
        return answer;
    }
}