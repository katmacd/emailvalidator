import static org.junit.Assert.*;

import org.junit.Test;

public class ev_backendTest {

	@Test
	public void test() {
		
		boolean accurateEmail1 = ev_backend.eChecker("@.");
		boolean inaccurateEmail1 = ev_backend.eChecker("");
		
		//Makes sure that . eChecker finds @.
		assertEquals(accurateEmail1, true);
		
		//checks that it doesn't have
		assertEquals(inaccurateEmail1, false);
		
	}

}
