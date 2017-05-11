import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testXML {
	
	@Parameters({"parameter1","parameter2"})
    @Test(groups="parameter")
    public void parameter(String parameter1,int parameter2 )
    {
        System.out.println("parameter1 is "+parameter1 );
        System.out.println("parameter2 is "+parameter2 );
    }
	
}
