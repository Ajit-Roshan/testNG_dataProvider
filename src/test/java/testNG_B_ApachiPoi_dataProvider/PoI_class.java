package testNG_B_ApachiPoi_dataProvider;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoI_class {

	public Object[] poiAction() throws Throwable {
		Object[] obj= new Object[1];
		
		Workbook wb= new XSSFWorkbook(new File("dataSet.xlsx"));
		
		Sheet sheet= wb.getSheetAt(0);
		
		int rowCount= sheet.getLastRowNum();
		int colCount= sheet.getRow(0).getLastCellNum();		
		
		String name= sheet.getRow(1).getCell(0).getStringCellValue();
		
		obj[0] = name;
		return obj;
		
	}
	
	
}
