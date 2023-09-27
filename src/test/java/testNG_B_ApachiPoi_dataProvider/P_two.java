package testNG_B_ApachiPoi_dataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P_two extends PoI_class {
	

	@Test(dataProvider = "data")
	public void t_1(String name1,String name2,String name3){
		
		System.out.println("test data received is :: "+name1);
		System.out.println("test data received is :: "+name2);
		System.out.println("test data received is :: "+name3);
		
	}
	
	@DataProvider(name = "data")
	public Object[] datas() throws Throwable {
		
		P_two call= new P_two();
		
		Object[][] res= call.poiAction();
		
		return res;
		
	}

	@BeforeMethod
	public void b() {
		System.out.println(" =====  data start ===== ");
	}

	@AfterMethod
	public void a() {
		System.out.println(" ===== data end ===== ");
		System.out.println("");
	}
	
}
