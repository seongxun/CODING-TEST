class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int length = my_string.length();
        if(my_string.equals(is_suffix))
            return 1;
        for(int i=0;i<length;i++)
        {
            if(my_string.length() != 1)
            {
                my_string = my_string.substring(1);
            }
            if(my_string.equals(is_suffix))
                return 1;
        }
        return answer;
    }
}