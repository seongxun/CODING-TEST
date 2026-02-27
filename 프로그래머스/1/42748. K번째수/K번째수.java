import java.util.Arrays;

class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            int[] temp = new int[commands.length];
            int a;
            int b;
            int c;
            for (int i = 0; i < commands.length; i++) {
                a = commands[i][0];
                b = commands[i][1];
                c = commands[i][2];
                temp = Arrays.copyOfRange(array, a-1, b);
                Arrays.sort(temp);
                answer[i] = temp[c-1];
            }
            return answer;
        }
    }