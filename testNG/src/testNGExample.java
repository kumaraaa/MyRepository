import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGExample {
	String message = "hello world!";
	String message1 = "hello world a!";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		Assert.assertEquals(message,messageUtil.printMessage());
	}
}
