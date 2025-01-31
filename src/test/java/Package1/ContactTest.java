<<<<<<< HEAD
package Package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContactTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser", "chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}

}
=======
package Package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContactTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser", "chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}

}
>>>>>>> e1426d6e818b09b11e1f8d0e66b1d3b6c3674114
