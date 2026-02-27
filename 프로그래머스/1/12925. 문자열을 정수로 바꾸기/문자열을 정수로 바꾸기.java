class Solution {
    public int solution(String s) {
        int answer = 0;
        String temp = "";//- 를 뺀 나머지 숫자를 저장할 임시 문자열
        boolean negative = false;//음수인지 판별할 변수
        //기본적으로 받은 문자열을 바로 숫자로 변환하는 메소드 활용할 생각
        //Integer.parseInt() : 이때는 -는 문자이므로 따로 처리해주어야함
        //Integer.valueOf() : new Integer(Integer.parseInt()) 같은 것, 마찬가지로 -는 따로 처리 해주어야함
        //- 처리는 어떻게 할 것인가? => 주로 맨 앞에 오므로 맨 앞이 - 라면 빼주고 숫자만 받아서 0에서 뺀다.
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '-'){
                negative = true;
                continue;//맨 앞에 - 기호가 있다면 넘어감
            }
            temp += s.charAt(i);    
        }
        if(negative)
            answer = 0 - Integer.parseInt(temp);
        else
            answer = Integer.parseInt(temp);
        return answer;
    }
}