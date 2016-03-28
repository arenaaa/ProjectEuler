package p0002;

import java.util.ArrayList;
import java.util.List;

/**
 *        0th  1th
 *  0  0   a   
 *  1  1   b    a
 *  2  1   c    b
 *  3  2        c=(a+b)
 *  4  3
 *  5  5
 *  6  8
 *  7 13
 *  8 21
 *  9
 * 10
 * @author jihyun
 *
 */
public class P0002Main {
	public static void main(String args[]) {
		Filter anyNumberOK = new Filter() {
			
			@Override
			public boolean accept(Integer value) {
				return true;
			}
		};
		
		Filter neverFilter = new Filter() {
			
			@Override
			public boolean accept(Integer value) {
				return false;
			}
		};
		
		Filter fiveFilter = new Filter() {
			public boolean accept(Integer value) {
				return value % 5 == 0;
			};
		};
		
		Filter evenNumOnly = new Filter() {
			
			@Override
			public boolean accept(Integer value) {
				boolean isEvenNum = value % 2 == 0;
				return isEvenNum ;
			}
		};
		List<Integer> fiboValues = P0002Main.fibo( 400_0000, evenNumOnly);
		System.out.println(fiboValues);
		
//		List<Integer> evenNums = evenNumberFilter(fiboValues);
//		System.out.println(evenNums);
		
		long sum = sum ( fiboValues );
		System.out.println(sum);
		
	}
	/**
	 * 숫자들의 합을 구합니다. 
	 * @param nums
	 * @return
	 */
	private static long sum(List<Integer> nums) {
		int sum = 0;
		for (Integer vn : nums) {
			sum += vn;
		}
		return sum;
	}
	/**
	 * 주어진 margin값보다 작은 피보나치 항들을 모아서 반환해줍니다.
	 * @param margin
	 * @return
	 */
	public static List<Integer> fibo(int margin, Filter filter) {
		int a = 0, b = 1, c = a + b;
		List<Integer> values = new ArrayList<>();
		while(c < margin){
			c = a + b; // k번째
			if ( filter.accept(c) ) {
				values.add(c);
			}
			
			a = b;     // k+1번째
			b = c;     // k+1번째
			
		} 
		values.remove(values.size()-1);//
		return values;
	}
	
//	public static List<Integer> evenNumberFilter ( List<Integer> values ) {
//		List<Integer> evennums = new ArrayList<>();
//		for (Integer num : values) {
//			if (num % 2 == 0) {
//				evennums.add(num);
//			}
//		}
//		return evennums;
//	}
}
