class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int i = numbers.length;
        int j = 0;
        while(j<i)
        {
            answer += numbers[j];
            j++;
        }
        answer = answer/i;
        return answer;
    }
}