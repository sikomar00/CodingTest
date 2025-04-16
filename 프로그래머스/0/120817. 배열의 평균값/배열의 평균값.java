class Solution {
    public double solution(int[] numbers) {
        double total = 0.0;
        for(double n : numbers) {
            total += n;
        }
        return total/numbers.length;
    }
}