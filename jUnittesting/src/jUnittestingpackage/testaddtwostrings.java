package jUnittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddtwostrings {

	@Test
	void test() {
		jUnitfunction jUnitString = new jUnitfunction();
		String result = jUnitString.addStrings("kushal", "challa");
		assertEquals("kushalchalla",result);
	}

}
