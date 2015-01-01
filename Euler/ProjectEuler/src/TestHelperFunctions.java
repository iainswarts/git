import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Test;

public class TestHelperFunctions {

	@SuppressWarnings("serial")
	@Test
	public void testFactorise() {
		HelperFunctions hf = new HelperFunctions();
		assertEquals(hf.factorise(5).size(), 1);
		
		assertEquals(new ArrayList<Integer>(){{
			add(2);
			add(5);
		}
		}, hf.factorise(10));
		
		assertEquals(new ArrayList<Integer>(){{
			add(2);
			add(2);
			add(5);
		}
		}, hf.factorise(20));
	}
	
	@Test
	public void testIsPrime() {
		HelperFunctions hf = new HelperFunctions();
		assertEquals(hf.isPrime(5), true);
		assertEquals(hf.isPrime(2), true);
		assertEquals(hf.isPrime(1), false);
		assertEquals(hf.isPrime(4), false);
	}
	
	@Test
	public void testFactorial() {
		HelperFunctions hf = new HelperFunctions();
		assertEquals(hf.factorial(2), 2);
		assertEquals(hf.factorial(3), 6);
		assertEquals(hf.factorial(4), 24);
		assertEquals(hf.factorial(5), 120);
	}
	
	@Test
	public void testStringMult() throws FileNotFoundException {
		HelperFunctions hf = new HelperFunctions();
		hf.stringMult("Test.txt", "TestOut.txt",5);
	}
//	
//	@Test
//	public void testStringMultInt() throws FileNotFoundException {
//		HelperFunctions hf = new HelperFunctions();
//		hf.stringMult("Test.txt", "TestOut.txt",425);
//	}
	
	@Test
	public void testReverseString() {
		HelperFunctions hf = new HelperFunctions();
		assertEquals("olleH", hf.reverseString("Hello"));
		assertEquals("ba", hf.reverseString("ab"));
		assertEquals("a", hf.reverseString("a"));
	}
	
	@Test
	public void testFactors() {
		HelperFunctions hf = new HelperFunctions();
		assertEquals(hf.getFactors(5).size(), 1);
		
		assertEquals(new ArrayList<Integer>(){{
			add(2);
			add(5);
			add(1);
		}
		}, hf.getFactors(10));
		
		assertEquals(new ArrayList<Integer>(){{
			add(2);
			add(4);
			add(5);
			add(10);
			add(1);
		}
		}, hf.getFactors(20));
	}
	
	
	@Test
	public void testStringAdd() throws FileNotFoundException {
		HelperFunctions hf = new HelperFunctions();
		hf.stringAdd("Test.txt", "TestOut.txt", "Testoutout.txt");
	}
	
	@Test
	public void testPand() {
		assertTrue(HelperFunctions.isPand("1234"));
		assertTrue(HelperFunctions.isPand("4321"));
		assertFalse(HelperFunctions.isPand("1233"));	
	}
	
	
}
