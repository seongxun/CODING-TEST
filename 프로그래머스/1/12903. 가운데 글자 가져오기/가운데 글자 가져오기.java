class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[s.length()];
        for(int i = 0; i<s.length(); i++)
        {
            arr[i] = s.charAt(i);
        }
        if(s.length()%2 != 0)
            sb.append(arr[s.length()/2]);
        else
        {
            sb.append(arr[s.length()/2-1]);
            sb.append(arr[s.length()/2]);
        }
        answer = sb.toString();
        return answer;
    }
}