class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int length = control.length();
        char[] temp = new char[length];
        for(int i=0;i<length;i++)
        {
         char idx = control.charAt(i);
         if(idx == 'w')
             n += 1;
         else if(idx=='s')
             n -= 1;
         else if(idx=='d')
             n += 10;
         else
             n -= 10;    
        }
        return n;
    }
}