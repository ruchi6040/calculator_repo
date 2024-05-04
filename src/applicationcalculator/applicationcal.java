package applicationcalculator;

import static org.junit.jupiter.Assertions.*;

import org.junit;

class applicationcal {

	@Test
	public void testadd() {
		assertEquals(30,applicationcalculator.add(10, 20));
	}
		// TODO Auto-generated method stub
		
	private void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	}
	@Test
	public void testsub() {
		assertEquals(-10,applicationcalculator.sub(10, 20));
	}
	@Test
	public void testmul() {
		assertEquals(200,applicationcalculator.mul(10, 20));
	}
	@Test
	public void testdiv() {
		assertEquals(0.5,applicationcalculator.div(10, 20));
	}



}
