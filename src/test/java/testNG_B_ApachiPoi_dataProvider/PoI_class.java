package testNG_B_ApachiPoi_dataProvider;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.text.html.parser.Parser;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoI_class {

	public Object[][] poiAction() throws Throwable {

		Workbook wb= new XSSFWorkbook(new File("dataSet.xlsx"));
		Sheet sheet= wb.getSheetAt(0);

		int rowCount= sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();

//		System.out.println("rows are :: "+rowCount);
//		System.out.println("columns are :: "+colCount);
				
		Object[][] dSet= new Object[rowCount][colCount];
		
		int index= 1;
		for(int i= 0; i< rowCount; i++) {
			for(int j= 0; j< colCount; j++) {
				dSet[i][j]=sheet.getRow(index).getCell(j).getStringCellValue();
			}
			index ++;
		}		
		return dSet;		
	}
}
