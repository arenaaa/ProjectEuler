package P0007;

import java.util.List;

/**
 * 소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다. 이 때 10,001번째의 소수를 구하세요.
 * 
 * @author 맹지현
 *
 */
public class P007Main {

	public void Prime(int num) {
		int max = num;
		boolean[] a = new boolean[max];

		for (int i = 0; i < max; i++) {
			a[i] = true;
		}

		for (int n = 2; n < max; n++) {
			if (a[n - 1]) {
				// 에라테네스의 체?
				for (int ntimes = 2; n * ntimes <= max; ntimes++)
					a[n * ntimes - 1] = false;
			}
		}

		for (int i = 1; i < max; i++) {
			if (a[i]) {
				System.out.println((i + 1) + " ");
			}
		}

	}

	/**
	 * 
	 * @param primeNum - 소수이고 홀수입니다.(2는 절대 아님)
	 * @return
	 */
	public static long nextPrime ( long primeNum ) {
		
		long target = primeNum + 2; // 29
		int div = 3;                // 29
		
		while(  target > div ) {
			if ( target % div != 0 ) {
				div += 2;
			} else {
				// target % div == 0
				target += 2;
				div = 3;
			}
		}
		
		return target;
	}
	
	public static long nextPrime2 ( long primeNum ) {
		
		long target = primeNum + 2; // 29
		int div = 3;                // 29
		/*
		 * target = 100 ; 10 * 10
		 * div = 3 -> 5 -> 7 -> 9 -> 11 
		 * 
		 */
		while( target >= div*div ) {
//		while( margin > div ) {
			if ( target % div != 0 ) {
				div += 2;
			} else {
				// target % div == 0
				target += 2;
				div = 3;
			}
		}
		return target;
	}
	
	private List<Integer> findPrimes ( long limit) {
		long margin = (long) Math.sqrt(limit);
		for ( long div = 3 ; div <= margin ; div +=2 ) {
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		P007Main p = new P007Main();
		p.Prime(10);
		
		/*
		 * [2, 3, 5, 7, 11, 13]
		 */
		long two = 2;     // 0th
		long three = 3;
		int nth = 2; // 2하고 3은 찾았다고 가정합니다. 왜냐하면 입력값이 짝수이면 메소드 안에서 별도릐 처리를 또 해줘야 합니다.
		
		long primeNum = three;
		while ( nth < 10001 ) {  // 2 번째 소수 
			primeNum = nextPrime2(primeNum);
			nth ++ ;
		}
		System.out.println("answer: " + primeNum);
		
	}
}