package p0001;
/**
 * 
 * @ref http://euler.synap.co.kr/prob_detail.php?id=1
 * @author jihyun
 *
 */
public class P0001Main {
	public static void main(String[] args) {
		int answer = 0;
		for ( int n = 1 ; n < 1000 ; n ++ ){
			if ( is3or5(n) ) {
				answer += n;
			}
		}
		System.out.println(answer);
	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static boolean is3or5 ( int num ) {
		return (num % 3 == 0 ) || (num % 5 == 0);
	}
}
