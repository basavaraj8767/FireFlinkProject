package ty1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_mult {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		data("Sheet1");
	}

	public static Object[][] data(String sheetname) throws EncryptedDocumentException, IOException {
		File file = new File("./Testdata/Testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int rcount = sh.getPhysicalNumberOfRows();
		int ccount = sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] arr = new Object[rcount - 1][ccount];
		for (int i = 0; i < rcount - 1; i++) {
			for (int j = 0; j < ccount; j++) {
				arr[i][j] = sh.getRow(i + 1).getCell(j).toString();
			}
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
		 * j++) { System.out.print(arr[i][j] + " "); } System.out.println();
		 * 
		 * }
		 */
		return arr;
	}
}
