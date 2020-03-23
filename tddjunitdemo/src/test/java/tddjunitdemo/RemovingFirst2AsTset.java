package tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemovingFirst2AsTset {

	RemovingFirst2As removeFirst2As;
	
	@BeforeEach
	void setUp() {
		removeFirst2As=new RemovingFirst2As();
	}
	
	@Test
	void test1() {
		assertEquals("BCD",removeFirst2As.removeFirst2Charcters("ABCD"));
	}
	@Test
	void test2() {
		assertEquals("CD",removeFirst2As.removeFirst2Charcters("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD",removeFirst2As.removeFirst2Charcters("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA",removeFirst2As.removeFirst2Charcters("BBAA"));
	}
	@Test
	void test5() {
		assertEquals("BAA",removeFirst2As.removeFirst2Charcters("AABAA"));
	}

}
