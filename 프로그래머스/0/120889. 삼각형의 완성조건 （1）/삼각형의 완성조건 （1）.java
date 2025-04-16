class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int total = 0;
        
        for (int i=0; i<sides.length; i++) {
            if(sides[i] > max) {
                max = sides[i];
            } 
            total += sides[i];
        }
        return (total - max > max)? 1:2;
    }
}
