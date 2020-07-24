package com.epam.tddjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckAInFirst {
	/*
	 * 1. starting A : AABC - BC - success
	 * 2. Ending A : BCDAA - BCDAA - success
	 * 3. Starting and Ending: ABCDA - BCDA - success
	 * 4. Only starting A : AA - "" - success
	 * 5. Null : "" - "" - success
	 * 6. Starting A : A - "" - success
	 */
	RemoveStartingACharacter removeStartingACharacter;
	
	@BeforeEach
	void excecuteBefore() {
		removeStartingACharacter = new RemoveStartingACharacter();
	}
	@Test
	void testCase1() {
		assertEquals("BC", removeStartingACharacter.remove("AABC"));
	}
	@Test
	void testCase2() {
		assertEquals("BCDAA", removeStartingACharacter.remove("BCDAA"));
	}
	@Test
	void testCase3() {
		assertEquals("BCDA", removeStartingACharacter.remove("ABCDA"));
	}
	@Test
	void testCase4() {
		assertEquals("", removeStartingACharacter.remove("AA"));
	}
	@Test
	void testCase5() {
		assertEquals("", removeStartingACharacter.remove(""));
	}
	@Test
	void testCase6() {
		assertEquals("", removeStartingACharacter.remove("A"));
	}
}
