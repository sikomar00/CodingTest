class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i=0; i<strlist.length; i++ ) {
            answer[i] = strlist[i].length();//
        }
        return answer;//각 원소의 길이를 담은 배열
    }
}
/*
length: 배열의 길이
legnth(): 문자열의 길이
size(): Collection, 자료구조의 크기
*/