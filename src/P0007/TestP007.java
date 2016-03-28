package P0007;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestP007 {

	@Test
	public void test() {
		assertEquals ( 5, P007Main.nextPrime(3));
		assertEquals ( 7, P007Main.nextPrime(5));
		assertEquals ( 11, P007Main.nextPrime(7));
		assertEquals ( 13, P007Main.nextPrime(11));
		assertEquals ( 17, P007Main.nextPrime(13));
		
		assertEquals ( 19, P007Main.nextPrime(17));
		
		assertEquals ( 29, P007Main.nextPrime(23));
		
		
	}

}
