class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] temp = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0;i < numbers.length; i++)
        {
            for(int j = 0; j<10 ; j++)
            {
                if(numbers[i] == temp[j])
                    temp[j] = 0;
            }
        }
        
        for(int i = 0; i< 10; i++){
            answer += temp[i];
        }
        return answer;
    }
}