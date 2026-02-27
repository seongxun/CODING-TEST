class Solution {
    public String[] solution(String[] strArr) {
        String[] temp = new String[strArr.length];
        int cnt = 0;
        int j = 0;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].contains("ad"))
                continue;
            else{
                temp[j] = strArr[i];
                j++;
            }
        }
        for(int i = 0;i<temp.length;i++)
        {
            if(temp[i] != null)
                cnt++;                
        }
        String[] answer = new String[cnt];
        for(int i = 0;i<cnt;i++)
        {
            answer[i] = temp[i];
        }
        
        return answer;

    }
}