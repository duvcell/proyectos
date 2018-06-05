package RetoSelenium.RetoFinalCursoSelenium.Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import RetoSelenium.RetoFinalCursoSelenium.Object.DatosObject;
import RetoSelenium.RetoFinalCursoSelenium.Pages.DatosGeneradosPage;

public class ExcelUtils {
	DatosGeneradosPage datosGeneradosPage = new DatosGeneradosPage();
	
	private XSSFSheet excelWSheet;                                                               

	private XSSFWorkbook excelWBook;

	private XSSFCell cell;

	private String fileName;

	public ExcelUtils(String fileName) {
		this.fileName = fileName;

	}

	public void setExcelFile(String sheetName) {

		try {
			FileInputStream excelFile = new FileInputStream(fileName);
			excelWBook = new XSSFWorkbook(excelFile);
			excelWSheet = excelWBook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public String getCellData(int rowNum, int colNum) {

		try {
			cell = excelWSheet.getRow(rowNum).getCell(colNum);
			return cell.getStringCellValue();

		} catch (Exception e) {
			return "";
		}

	}

	public void setCellData(String result, int rowNum, int colNum) {

		try {

			XSSFRow row = excelWSheet.getRow(rowNum);
			if(row == null) {
				row = excelWSheet.createRow(rowNum);
			}
			
				cell = row.getCell(colNum);
				

			if (cell == null) {
				
				cell = row.createCell(colNum);
				cell.setCellValue(result);
			} else {
				cell.setCellValue(result);
			}

			FileOutputStream fileOut = new FileOutputStream(fileName);
			excelWBook.write(fileOut);

			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
}
