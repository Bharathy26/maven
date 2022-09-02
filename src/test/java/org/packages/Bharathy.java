package org.packages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.poifs.filesystem.DocumentOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Bharathy {
	
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\ELCOT\\eclipse-workspace\\NewProjectpackage\\Excel\\Book1.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(f);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
				CellType cellType = cell.getCellType();
				
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
					break;

				case NUMERIC:
					if(DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
						String format2 = format.format(dateCellValue);
						System.out.println(format2);
					}
						else {
							double d = cell.getNumericCellValue();
							long round = Math.round(d);
							
						if(d==round) {
							String valueOf = String.valueOf(round);
						System.out.println(valueOf);
						}
						
						else {
							String valueOf1 = String.valueOf(d);
							System.out.println(valueOf1);
						}
						

					}
					break;
					
					
					
				default:
					break;
				}
			}
		}
	}
		
		
		
		

	}

	


