class Solution {
    public int solution(String[] s1, String[] s2) {
        
        int count = 0;
        for (int i=0; i<s1.length; i++) {
            for (int j=0; j<s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    count++;
                }
            }  
        }
    return count;
    }
}
/*
s1[i] == s2[j] //주소(참조값)을 비교, 두 문자열이 같은 객체일때만 true가 된다.
    같은객체: 두 변수가 같은 주소를 가리킴(동일한 메모리 공간을 바라보고 있다)
    내용이 같다: 두 변수 안에 있는 글자만 같음 됨. 메모리 주소 달라도 상관없음
    
        String a = new String("apple");
        String b = new String("melon");
        Sout(a == b); // false:주소 다름
        Sout(a.equals(b)); // true:내용 같음
    
s1[i].equals(s2[j]) //내용(문자열 값 자체)을 비교.

*/
