package P0003; 
 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class P003 {
	
	public ArrayList<Integer> div(long number){
//		intput = 333;
		int divNum = 2; // 
		ArrayList primes = new ArrayList();
//		Set primes = new HashSet();
//		long number = input;
		do {
			if( number % divNum == 0) {
				if ( !primes.contains(divNum)) {
					primes.add(divNum);					
				}
				number = number / divNum;
			} else {
				do { divNum += 1; }
				while (number % divNum != 0);
				primes.add(divNum); // number가 사라짐 -- 2밖에 찍히지 않을 것임
				number = number / divNum;
			}
		} while (number > 1) ; // input > 1 
		
//		return new ArrayList(primes);
		return primes;
				
	}

	public ArrayList<Integer> div2(final long input){
		int divNum = 2; //
		Set<Integer> primes = new HashSet<>();
		long number = input;
		do {
			if( number % divNum == 0) {
				primes.add(divNum);					
			} else {
				while ( number % divNum != 0) {
					++ divNum ;
				}
			}
			number = number / divNum;
		} while (number > 1) ; // input > 1 
		
		return new ArrayList<Integer>(primes);
		
	}
 
	public static void main(String[] args){
		int a = 10, b = 3;
		String v = ++a + " and " + ++b;
		// a = 10 and then b = 4
		// b = 4 and then a = 10
		// java 언어 스펙에서 보장하지 않습니다.
		System.out.println( v );
		// a += 1; sysout() b += 1 ;
		
		P003 p = new P003();
		
		ArrayList<Integer> primes = p.div(600851475143L);
		
		System.out.println( primes.get( primes.size()-1)); // 2 * 3 * 5
		System.out.println(p.div2(2 * 2 * 3 * 3)); // 2 * 3 * 5
	}
	
}