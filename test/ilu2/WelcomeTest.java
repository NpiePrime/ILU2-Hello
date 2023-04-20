package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void testWelcome() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
		assertNotEquals(Welcome.welcome("bob"), "Hello, bob");
	}

}
