package testNG_B_ApachiPoi_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P_two extends PoI_class {
	

	@Test(dataProvider = "data")
	public void t_1(String name){
		
		System.out.println("test name received is :: "+name);
		
	}
	
	@DataProvider(name = "data")
	public Object[] datas() throws Throwable {
		
		P_two call= new P_two();
		
		Object[] res= call.poiAction();
		
		return res;
		
	}
	
}
