class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int[] answer = new int[length - 1];
        if (length == 1)
            return new int[]{-1};
        else {
            int index = arr[0];
            int cnt = 0;
            for (int i = 1; i < length; i++) {
                if (index > arr[i]) {
                    index = arr[i];
                    cnt = i;
                }
            }
            answer = removeAt(arr, cnt);
        }
        return answer;
    }
    public int[] removeAt (int[] array, int idx){
            int n = array.length;
            int[] res = new int[n - 1];

            // idx 앞까지 복사
            System.arraycopy(array, 0, res, 0, idx);
            // idx 뒤부터 복사
            System.arraycopy(array, idx + 1, res, idx, n - idx - 1);

            return res;
        }
}