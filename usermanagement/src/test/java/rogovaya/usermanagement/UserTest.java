package rogovaya.usermanagement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {

	private User user;
	private Date dateOfBirth;
	
	public UserTest() {
	    super();
	}
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		this.user = new User();
		Calendar calendar = Calendar.getInstance();
		calendar.set(1990, calendar.JULY, 23);
		dateOfBirth = calendar.getTime();
	}

	@Test
	public void testGetFullName() {
		this.user.setFirstName("Lyubov");
		this.user.setLastName("Rogovaya");
		assertEquals("Lyubov, Rogovaya", this.user.getFullName());
	}
	
	public void testGetAge() {
		user.setDateOfBirth(dateOfBirth);
		assertEquals(2018 - 1990, user.getAge());
		
	}

}
