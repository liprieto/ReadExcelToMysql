package com.api.helper;

import com.api.entity.Altas;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {
	// *

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
		
		
		String base = "";
		
		try {
			
			
			//FileInputStream fis = new FileInputStream(f);

            @SuppressWarnings("resource")
            XSSFWorkbook excelWorkbook = new XSSFWorkbook(is);
            XSSFSheet excelSheet = excelWorkbook.getSheetAt(0);

            int rows = excelSheet.getPhysicalNumberOfRows();
            int cols = excelSheet.getRow(0).getPhysicalNumberOfCells();
            String matriz[][] = new String[rows][cols];
            XSSFCell cell;

            for (int i = 1; i < 2; i++) {
                // Archivo original
                // for (int i = 1; i < rows; i++) {
                for (int j = 2; j < cols; j++) {

                    cell = excelSheet.getRow(i).getCell(j);
                    if (cell != null) {
                        DataFormatter formatter = new DataFormatter();
                        String cellContents = formatter.formatCellValue(cell);
                        matriz[i][j] = cellContents;
                        //System.out.println(matriz[i][j]);
                    }
                    
                    if (j == 2) {

                        String filial = (matriz[i][j]);
                        if (filial != null) {
                            base = "";
                            // System.out.println("La filial es: " + filial);

                            switch (filial) {

                                case "60":
                                    base = "SIFOSOSDEMETRO";
                                    break;
                                case "11":
                                    base = "SIFOSOSDEMENDOZA";
                                    break;
                                case "2":
                                    base = "SIFOSOSDECORDOBA";
                                    break;
                                default:
                                    base = "SIFOSOSDENACIONAL";
                                    break;

                            }
                            System.out.println("Corresponde a: " + base);
                }
            }
            
                }
            }
			 //bloque try

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
	
	
	
}