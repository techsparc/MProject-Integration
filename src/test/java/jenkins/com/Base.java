package jenkins.com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	@BeforeTest
	public void open() {
		System.out.println("browser opened");
		
	}
	@AfterTest
	public void close() {
		System.out.println("browser closed");
	}

}
