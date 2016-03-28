package P0005;

import java.util.ArrayList;
import java.util.List;

/**
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
    그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
    소인수 구하기
   NUM               RESULT 
                        1    
    2 = [ 2 ]           2
    3 = [ 3 ]           6   3
    4 = [ 2, 2]        12
    5 = [ 5 ]          60
    6 = [ 2, 3]        60
    7 = [ 7 ]         420
    8 = [ 2, 2, 2 ]   840
    9 = [ 3, 3]       840
    10= [ 2, 5]       840*3 = 2520
    11= [11]          11*840
    .
    50 = []
    .
    20 = [2, 2, 5 ]  
    100 = [2, {50}]
 * @author 맹지현
 *
 */
public class P0005Main {

	/**
	 * 주어진수의 소인수들을 리스트로 반환합니다.
	 * n번째 소수 구하기
	 * 약수구하기  : 36 = [1, 2, 3,4, 6, 9, 12 18, 36]
	 * 
	 * 소인수분해 : 36 = [ 2, 2, 3, 3]
	 * 
	 *  NUM        DIV          PF
	 *   36          2        [2]
	 *   18          2        [2, 2]
	 *    9          2
	 *    9          3        [2, 2, 3]
	 *    3          3        [2, 2, 3, 3]
	 *    1          3         stop while ( NUM > 1 ){}
	 *    
	 * 
	 * @param num
	 * @return
	 */
	public static List<Integer> getPrimeFactors ( int num) {
		List<Integer> pfactors = new ArrayList<>();
		int div = 2;
		while ( num > 1 ) {
			if( num % div == 0) {
				pfactors.add(div);
				num = num / div;
			} else {
				div = div + 1;
			}
		}
		return pfactors;
	}
	
   public static long first() {
      
      long result = 1;
      
      while(true){
         
         boolean isNum = true;
         
         for (int i = 2; i <= 40; i++){
            if(result % i != 0 ){
               isNum = false;
               break;
            }
         }
         
         if(isNum){
            break;
         } 
         
         result = result + 1;
         
      }
      return result;
      
   }
   
   public static long second ( int margin ) {
	   long result = 1;
	   for ( int n = 2 ; n <= margin ; n ++ ) {
		   long value = result ;
		   List<Integer> list = getPrimeFactors(n);
		   for(int i = 0; i < list.size(); i++){ // zero-base    10  
			   int pf = list.get(i);
			    if ( value % pf != 0 ) {
			    	result *= pf;
			    } else {
			    	// result : 12, pf[0]:2  --> result: 6
			    	value = value / pf ;
			    }
		   }
	   }
	   return result;
   }
   public static void main(String[] args) {
      List<Integer> factors = getPrimeFactors(20);
      
      long result = second( 20 );
      System.out.println(result);
      System.out.println(first());
   }

}