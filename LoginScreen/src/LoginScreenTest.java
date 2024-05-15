import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest {

	public void testSuccessfulLogin(){
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("john1", "password123"));

	}

	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("john", "wrongpassword"));
		
	}
	
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("testuser", "testpassword");
		assertTrue(loginScreen.login("testuser", "testpassword"));
	}
}