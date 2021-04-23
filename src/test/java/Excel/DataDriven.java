package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//port javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Dibyajyoti.Das\\Desktop\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		int noOfSheet=wb.getNumberOfSheets();
		for(int i=0;i<=noOfSheet-1;i++){
			if(wb.getSheetName(i).equalsIgnoreCase("Sheet1")){
				XSSFSheet sheet=wb.getSheetAt(i);
				//sheet collection of rows
				Iterator<Row> rows=sheet.iterator();
				//row collections of cells
				Row firstRow=rows.next();
				Iterator<Cell> ce=firstRow.cellIterator();
				int k=0;
				int coulmn=0;
				while(ce.hasNext()){
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases")){
						//desired column
						coulmn=k;
					}
					k++;
				}
				System.out.println(coulmn);
			}
		}

	}

}
