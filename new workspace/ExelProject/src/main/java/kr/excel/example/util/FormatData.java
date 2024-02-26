package kr.excel.example.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

interface GetCellValue{
    String getCellValue(Cell cell);
}
public class FormatData {
    private FormatData() {}

    public static String getCellValue(Cell cell){
        return getCellValueMethod(cell).getCellValue(cell);
    }
    private static String getDateValue(Cell cell){
        Date dateValue=cell.getDateCellValue();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate=dateFormat.format(dateValue);

        return formattedDate;
    }
    private static GetCellValue getCellValueMethod(Cell cell){
        GetCellValue gcvm = null;
        switch (cell.getCellType()){
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) gcvm = (c) -> getDateValue(c);
                else{
                    double numericValue = cell.getNumericCellValue();
                    if (numericValue == Math.floor(numericValue)) gcvm = (c) -> Integer.toString((int) numericValue);
                    else gcvm = (c) -> Double.toString(numericValue);
                }
                break;
            case STRING:
                gcvm = (c) -> c.getStringCellValue();
                break;
            case BOOLEAN:
                gcvm = (c) -> Boolean.toString(c.getBooleanCellValue());
                break;
            case BLANK:
                gcvm = (c) -> "";
                break;
            case FORMULA:
                gcvm = (c) -> c.getCellFormula();
                break;
            default:
                gcvm = (c) -> "";
                break;
        }
        return gcvm;
    }
}
