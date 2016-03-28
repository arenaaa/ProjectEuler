package P0006;
/**
 * 1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
   12 + 22 + ... + 102 = 385
   1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
   (1 + 2 + ... + 10)2 = 552 = 3025
     따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
     그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
 */
public class P0006Main {

   /*
    제곱의 합 구하는 메소드
   */
   public static int sumOfSquare(int N) {
      int result = 0;
      
      for(int i=1; i<=N; i++){
         result += Math.pow(i, 2);
      }
      
      return result;
   }
   
   /*
    합의 제곱 구하는 메소드
   */
   public static int squareOfSum(int N) {
      int result = 0;
      // 1에서 n까지 합하는 공식 : 
      for(int i=1; i<= N ; i++){
         result += i;
      }
      result = N * ( N + 1) / 2;
      
      result = result * result;
      return result;
   }
   public static void main(String[] args) {
      
      P0006Main p = new P0006Main();
//      if(P0006Main.sumOfSquare()> P0006Main.squareOfSum()){
//         int result = P0006Main.sumOfSquare() - P0006Main.squareOfSum();
//         System.out.println(result);
//      } else {
//         int result = P0006Main.squareOfSum() - P0006Main.sumOfSquare();
//         System.out.println(result);
//      }
      int result = P0006Main.sumOfSquare(100) - P0006Main.squareOfSum(100);
      System.out.println(Math.abs(result));
   }

}