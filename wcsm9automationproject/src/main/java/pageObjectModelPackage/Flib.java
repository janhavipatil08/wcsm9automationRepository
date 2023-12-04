package pageObjectModelPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readDataFromexcel( String excelpath, String sheetname, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		
		String data = null;
		if(cell.getCellType()==cell.getCellType().STRING)
		{
			data= cell.getStringCellValue();
		}
		
		else if(cell.getCellType()==cell.getCellType().NUMERIC)
		{
			cell.getStringCellValue();
			data=String.valueOf(cell.getNumericCellValue());
		}
		return data;
			
		}
	
	public void writeDataToExcel(String excelpath, String sheetName, int rowcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowcount);
		Cell cell = row.createCell(rowcount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}
		
	public int rowcount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
		
	}
	public String readDataFromPropertyFile(String propertyFile,String key1) throws IOException
	{
		FileInputStream fis=new FileInputStream(propertyFile);
		
		Properties prop=new Properties();
		prop.load(fis);
		String data=prop.getProperty(key1);
		return data;
	
	}
}
		
		
		
		
		

//}
