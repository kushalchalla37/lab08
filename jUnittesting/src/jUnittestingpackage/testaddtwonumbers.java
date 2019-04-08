package jUnittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddtwonumbers {

	@Test
	void test() {
	jUnitfunction jUnit = new jUnitfunction();
	int result = jUnit.addnumbers(100,1);
	assertEquals(101,result);
	
	}

}
