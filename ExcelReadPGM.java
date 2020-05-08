import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadPGM {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fp = new FileInputStream("C:\\Users\\Amitendra\\Java and Automation\\Demo.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fp);
		XSSFSheet sh =wb.getSheet("TestData");
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
	
		//total number of rows
		System.out.println(sh.getPhysicalNumberOfRows());
		
		//total number of columns
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) //rows
		{
			for(int j=0;j<sh.getRow(0).getPhysicalNumberOfCells();j++)//columns
			{
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue() + "   ");
			}
			System.out.println();
		}
	}

}
