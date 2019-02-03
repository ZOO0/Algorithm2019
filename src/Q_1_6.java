
/*
*1.6* 문자열 압축 : 
  반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축 메서드를 작성하라.
  예를 들어 문자열 aabcccccaaa를 압축하면 a2b1c5a3이 된다. 
  만약 ‘압축된’ 문자열의 길이가 기존 문자열의 길이보다 길다면 기존 문자열을 반환해야 한다. 
  문자열은 대소문자 알파벳(a~z)으로만 이루어져 있다.
 */

public class Q_1_6 {
	
	public static void main(String[] args) {
		System.out.println(archiveString(args[0])); // args[0] : aabcccccaaa
	}
	
	public static String archiveString(String str){
        int strLength = str.length();
        StringBuilder res = new StringBuilder();
        int count = 1;
        
        for( int i = 0; i < strLength; i++) {
            if ( i < strLength-1 && (str.charAt(i) == str.charAt(i+1)) ) {
                count ++;
                continue;
            } else {
                res.append( str.charAt(i) );
                res.append( count );
                count = 1;
            }
        }
        
        if (res.length() > strLength){
            return str;
        }
        
        return res.toString(); // a2b1c5a3
    }
}

// 시간복잡도 : 시간복잡도 : O(n)
