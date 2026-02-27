class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] char_str = new char[my_string.length()];
        String idx = "";
        for(int i = 0;i<my_string.length();i++)
        {
            char_str[i] = my_string.charAt(i);
            idx += char_str[i];
            if(idx.equals(is_prefix))
                return 1;
        }
        return answer;
    }
}