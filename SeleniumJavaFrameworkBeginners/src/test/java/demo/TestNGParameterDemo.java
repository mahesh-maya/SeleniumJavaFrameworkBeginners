package demo;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {

	@Test
	 @Parameters({"MyName"})
	public void test(@Optional("Mahesh") String name) {
		
		System.out.println("my name is : "+name);
	}
	
	
}
