class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;//p의 갯수를 셀 변수 선언
        int yCnt = 0;//y의 갯수를 셀 변수 선언
        //String의 각 문자를 받아와 p 또는 y 이면 pCnt 또는 yCnt 증가 시킨다.
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                pCnt++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                yCnt++;
        }
        //pCnt와 yCnt가 모두 0이라면 answer = true 이다.
        if(pCnt == yCnt || (pCnt == 0 && yCnt == 0))
            answer = true;
        else
            answer = false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;
    }
}