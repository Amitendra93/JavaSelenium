import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	
	@Test(dataProvider="data")
	public void login(String uname, String passwd)
	{
		System.out.println(uname + " " + passwd);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object arr[][]= new Object[2][2];
		
		arr[0][0]="user1";
		arr[0][1]="pass1";
		arr[1][0]="user2";
		arr[1][1]="pass2";
		
		return arr;
	}

}
