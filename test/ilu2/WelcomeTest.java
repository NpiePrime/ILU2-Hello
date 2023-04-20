package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testWelcomeEx_1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
		assertNotEquals(Welcome.welcome("bob"), "Hello, bob");
	}
	
	@Test
	void testWelcomeEx_2() {
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome("		"), "Hello, my friend");
		assertEquals(Welcome.welcome("						"), "Hello, my friend");
	}
}
