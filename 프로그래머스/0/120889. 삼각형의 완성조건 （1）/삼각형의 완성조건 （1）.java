class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int total = 0;
        
        for (int i=0; i<=sides.length-1; i++) {//0 1 2
            if(max <= sides[i]) {
                max = sides[i];
            } 
                total += sides[i];
        }
        
        if(total - max <= max) {
            answer = 2;
        } else if ( total - max > max ) {
            answer = 1;
        }
        
        return answer;
    }
}
