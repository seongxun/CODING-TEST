class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] char1 = new char[str1.length()];
        char[] char2 = new char[str2.length()];
        int a = str1.length();
        int b = str2.length();
         String str = "";
        if(a>=b){
        for(int i = 0;i<a;i++)
        {
            char1[i]=str1.charAt(i);
            char2[i]=str2.charAt(i);
          str+= char1[i];
            str+=char2[i];
}
         }
        else
        {
for(int i = 0;i<b;i++)
        {
    char1[i]=str1.charAt(i);
            char2[i]=str2.charAt(i);
          str+= char1[i];
            str+=char2[i];
}
}
        return str;
    }
}