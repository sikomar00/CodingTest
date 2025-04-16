import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);//0번 인덱스부터 있으므로, num2 번째에서 한 인덱스 더해줘
    }
}