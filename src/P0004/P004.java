package P0004;

/**
 * 
 * @author jihyun
 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
   두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
   세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
 */
public class P004 {
	
	public static String reverse(String s) {
		// s : "4224"
		String rs = ""; // "4321"
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); /// '2'
			rs = ch + rs ; 
		}
		// TOP:  ["4", "2", "2", "4"]
//		rs += TOP.pop(); // "4224"
		return rs;
	}
	public static boolean isPalindrome(int num){
//	 System.out.println(num);
//		String str = "" + num;
		String str = String.valueOf(num);
		// str1 : 968, str2 : 869
		/*
		 *   str[0] == str2[2]
		 *   str[1] == str2[1]
		 *   str[2] == str2[0];
		 */
		String str2 = reverse(str);
//		if ( str.equals(str2) ) {
//			return true;
//		} else {
//			return false;
//		}
		return str.equals(str2) ;
		
//		return true;
	}
	
	public static void main(String[] args) {
		first();
		sencond();
	}

	private static void sencond() {
		// TODO Auto-generated method stub
		// 999 + 999 -> 999999 = A x B
		// 998 + 899 -> 998899 = A x B
		// ...
		// 906 + 609 -> 906609
		
	}
	private static void first() {
		
		int answer = 0;
		for(int i = 99999; i > 99; i--){
			for(int k = 99999; k > 99; k--) {
				int num = i * k;
//				System.out.println("test : " + num);
				if( isPalindrome(num) ) {
//					System.out.println("found: " + num);
					if( num > answer) {
						answer = num;
					}
				}
				
			}
			// jump:
		}
		System.out.println("최종 :"+answer);
	}
}
