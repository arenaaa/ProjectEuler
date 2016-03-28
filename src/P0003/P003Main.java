package P0003;

public class P003Main {

	 static int number;
	 
	 /* 짝수인지 홀수인지 판단 */
	 public boolean isEven(int num) {
	  number = num;
	  
	  if(number % 2 == 0){
	   return true;
	  } else 
	   return false;
	 } 
	 
	 /* 짝수면 ?? 
	  * 10 = 1 2 5 10
	  * 20 = 1 2 4 5 10 20 */
	 public int ifEvenNumber(int num){
	  number = num;
	  int count = 0;
	  
	  for (int i = 2; i<=number; i++){
		  if(number % i == 0){
			  count ++;
			  if( count < 2){
				 System.out.print(" ");
			  }
			  
		  }
	   }
	  
	  return num;
	  
	 }
	  
	 /* 홀수면 약수만을 출력 */
	 public int ifOddNumber(int num){
		 number = num;
	  
	  for (int i = 1; i<=number; i++){
		  if(number % i == 0){
			  System.out.print(i+" ");
	   } 
	    
	 }
	  return num;
	 }
	 
	 public static void main(String[] args){
	  
		 int answer = 20;
		 P003Main p = new P003Main();
	  
		 	if( p.isEven(answer) ){
		 		p.ifEvenNumber(number);
		 	} else {
		 		p.ifOddNumber(number);  
		 	}
	  
	 }
}

