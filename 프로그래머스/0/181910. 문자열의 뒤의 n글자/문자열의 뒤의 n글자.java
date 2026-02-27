class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int idx = my_string.length() - n;
            for(int i = idx;i<my_string.length();i++)
            {
                answer += my_string.charAt(i);
            }
        return answer;
    }
}