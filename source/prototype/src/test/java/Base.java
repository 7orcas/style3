import static org.junit.Assert.*;

import org.junit.Test;
import org.style3.prototype.GroupRepo;


public class Base {

	@Test
	public void test() {
		
		GroupRepo r = new GroupRepo();
		r.loadGroups();
		assertNotNull(r.getGroups());
		assertTrue(r.getGroups().size() == 5);
		
	}

}
