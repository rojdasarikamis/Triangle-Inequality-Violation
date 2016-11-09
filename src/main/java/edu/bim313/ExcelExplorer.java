package edu.bim313;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;


public class ExcelExplorer {

    public int[][] distance;
    public String[] cities;

    public ExcelExplorer()
    {
        this.distance = new int[81][81];
        this.cities = new String[81];
    }

    @SuppressWarnings("deprecation")
    public void readExcelFileToGetCities(String fileName)
    {
        try
        {
            FileInputStream fstream = new FileInputStream(fileName);

            Workbook workbook = null;

            if(fileName.toLowerCase().endsWith("xlsx"))
            {
                workbook = new XSSFWorkbook(fstream);
            }

            else if(fileName.toLowerCase().endsWith("xls"))
            {
                workbook = new HSSFWorkbook(fstream);
            }

            Sheet sheet = workbook.getSheetAt(0);

            Row row = sheet.getRow(1);

            int iterator = 0;

            Iterator<Cell> cellIterator = row.cellIterator();

            while(cellIterator.hasNext())
            {
                String tmpCity = "";
                Cell cell = cellIterator.next();

                switch (cell.getCellType())
                {
                    case Cell.CELL_TYPE_STRING:
                        if(tmpCity.equalsIgnoreCase(""))
                        {
                            tmpCity = cell.getStringCellValue().trim();
                            this.cities[iterator] = tmpCity;
                            iterator++;
                        }
                        break;

                    case Cell.CELL_TYPE_NUMERIC:
                        break;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    @SuppressWarnings("deprecation")
    public void readExcelFileToGetDistances(String fileName)
    {
        try
        {
            FileInputStream fstream = new FileInputStream(fileName);

            Workbook workbook = null;

            if(fileName.toLowerCase().endsWith("xlsx"))
            {
                workbook = new XSSFWorkbook(fstream);
            }

            else if(fileName.toLowerCase().endsWith("xls"))
            {
                workbook = new HSSFWorkbook(fstream);
            }

            Sheet sheet = workbook.getSheetAt(0);

            for(int i = 2; i < 83; i++)
            {
                Row row = sheet.getRow(i);

                for(int j = 2; j < 83; j++)
                {
                    Cell cell = row.getCell(j);

                    switch(cell.getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            this.distance[i - 2][j - 2] = (int) cell.getNumericCellValue();
                            break;

                        case Cell.CELL_TYPE_STRING:
                            break;

                        case Cell.CELL_TYPE_BLANK:
                            break;
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
