import static org.junit.Assert.*;

import org.junit.Test;

public class ev_backendTest {

	@Test
	public void test() {
		
		boolean accurateEmail1 = ev_backend.eChecker("a@a.com");
		boolean inaccurateEmail1 = ev_backend.eChecker("");
		boolean inaccurateEmail2 = ev_backend.eChecker("aa.com");
		boolean inaccurateEmail3 = ev_backend.eChecker("aa@com");
		boolean inaccurateEmail4 = ev_backend.eChecker("aa@.ca");
		
		//Makes sure that . eChecker finds a valid address.
		assertEquals(accurateEmail1, true);
		
		//checks that it has more than the five characters @.com NEW RULE
		assertEquals(inaccurateEmail1, false);
		
		//Checks that it finds @ (Default rule)
		assertEquals(inaccurateEmail2, false);
		
		//Checks that it finds . before com NEW/OLD RULE
		assertEquals(inaccurateEmail3, false);
		
		//Checks that com is the last three letters .com (This could be .ca etc, however we can also assume it's for a specific check
		assertEquals(inaccurateEmail4, false);
	}

}
