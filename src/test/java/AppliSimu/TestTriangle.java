package AppliSimu;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

    private IHMVoiture monTriangle;
	@Before
	public void setUp() throws Exception {
        monTriangle = new IHMVoiture();
	}
	
	@Test
	public void testConversionMetresPixels() {

		int xPixels = monTriangle.calculerPositionPixels(110);
		
		assertEquals(55, xPixels);
	}

}
