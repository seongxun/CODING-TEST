class Solution {
    public int[] solution(long n) {
        String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];
        int j = 0;
        for(int i = temp.length()-1;i >-1;i--)
        {
            answer[i] = (int)(temp.charAt(j))-48;
            j++;
        }
        return answer;
    }
}