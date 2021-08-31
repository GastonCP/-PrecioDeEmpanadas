package EmpanadasPakage;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpandasTest {

	@Test
	public void constructorSinParametroTest() {
		Empanadas empanadas1 = new Empanadas();
		assertEquals(18, empanadas1.getCantidad());
	}
	
	@Test
	public void constructorConParametroTest() {
		Empanadas empanadas1 = new Empanadas(24);
		assertEquals(24, empanadas1.getCantidad());
	}
	
	@Test (expected = Error.class)
	public void constructorConParametroIncorrectoTest() {
		Empanadas empanadas1 = new Empanadas(0);
		assertEquals(24, empanadas1.getCantidad());
	}

}
