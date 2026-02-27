class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int length1 = my_string.length();
        int length2 = overwrite_string.length();
        char[] temp1 = new char[length1];
        char[] temp2 = new char[length2];
        int j = 0;
        for(int i = 0;i<length1;i++)
        {
            temp1[i] = (char)my_string.charAt(i);
        }
        for(int i = 0;i<length2;i++)
        {
            temp2[i] = (char)overwrite_string.charAt(i);
        }
        for(int i = s;i <s + length2;i++)
        {
            temp1[i] = temp2[j];
            j++;
        }
        for(int i = 0; i<length1;i++)
        {
            answer += temp1[i];
        }
        return answer;
    }
}