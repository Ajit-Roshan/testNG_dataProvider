package testNG_A;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P_one  {

	@Test(dataProvider= "dataSet" )
	public void baseTest(Object rData1,Object rData2) {
		System.out.println("baseTest : "+rData1+" and "+rData2);
	}
	
	@DataProvider(name= "dataSet")
	public Object[][] dataCollection() {
		
		Object[][] coll= {
				{"ajit","1"},{"roshan","2"},{"soy","3"},{"ranchi","4"},{"dhanbad","5"}
				};
				
				
		return coll;
	}
	
	
}