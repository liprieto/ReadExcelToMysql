package com.api.helper;

import com.api.entity.Altas;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {
	//*
	
	// Verificacion formato de archivo

	public static boolean checkExcelFormat(MultipartFile file) {

		String contentType = file.getContentType();

		if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			return true;
		} else {
			return false;
		}

	}

	// Conversión de datos en Array

	public static List<Altas> convertExcelToListOfAltas(InputStream is) {
		List<Altas> list = new ArrayList<>();
		
		System.out.println(0); 
		
		
		
		try {
			
			try (XSSFWorkbook workbook = new XSSFWorkbook(is)) {
				XSSFSheet sheet = workbook.getSheet("data");

				int rowNumber = 0;
				Iterator<Row> iterator = sheet.iterator();

				while (iterator.hasNext()) {
					Row row = iterator.next();
					//System.out.println(row);

					if (rowNumber == 0) {
						rowNumber++;
						continue;

					}

					Iterator<Cell> cells = row.iterator();

					int i = 0;

					Altas p = new Altas();

					while (cells.hasNext()) {
						Cell cell = cells.next();

						switch (i) {
						
						case 0:
							p.setAltasId((int) cell.getNumericCellValue());
							break;
						case 1:
							p.setNombre(cell.getStringCellValue());
							break;
						case 2:
							p.setApellido(cell.getStringCellValue());
							break;
						case 3:
							p.setCuit((int)cell.getNumericCellValue());
							break;
						default:
							break;
						}
						System.out.println(cell);

						i++;

					}

					list.add(p);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

}
