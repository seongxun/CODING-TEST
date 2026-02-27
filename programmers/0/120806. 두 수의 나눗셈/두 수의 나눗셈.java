class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float temp1, temp2;
        temp1 = num1;
        temp2 = num2;
        temp1 = temp1 / temp2;
        answer = (int)(temp1 * 1000);
        return answer;
    }
}