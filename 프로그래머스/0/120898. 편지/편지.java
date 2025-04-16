import java.util.*;
class Solution {
    public int solution(String message) {
        int count = 0;
        char[] charArr = message.toCharArray();
        for(char c: charArr) {
            count++;
        }
        return 2*count;
    }
}