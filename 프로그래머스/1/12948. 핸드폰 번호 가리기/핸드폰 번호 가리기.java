class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int i = phone_number.length();
        char[] arr = phone_number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < i; j++)
        {
            if(j < i - 4)
                sb.append('*');
            else
                sb.append(arr[j]);
            
        }
        answer = sb.toString();
        return answer;
    }
}