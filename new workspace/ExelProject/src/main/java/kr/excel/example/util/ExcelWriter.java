package kr.excel.example.util;

import kr.excel.example.vo.Member;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

public class ExcelWriter {
    private final static String DEFAULT_FILE_NAME = "members.xlsx";
    private String fileName;
    private final static String[] DEFAULT_HEADERS = {"이름", "나이", "생년월일", "전화번호", "주소", "결혼여부"};
    private final static String DEFAULT_SHEET_TITLE = "회원 정보";
    public ExcelWriter(){}
    public ExcelWriter(String fileName){
        this.fileName = fileName;
    }
    public void writeExcelInputData() throws IOException{
        writeExcelInputData(DEFAULT_FILE_NAME, DEFAULT_HEADERS, DEFAULT_SHEET_TITLE);
    }
    public void writeExcelInputData(String[] headerList, String sheetTitle) throws IOException{
        writeExcelInputData(DEFAULT_FILE_NAME, headerList, sheetTitle);
    }
    public void writeExcelInputData(String fileName) throws Exception{
        writeExcelInputData(fileName, DEFAULT_HEADERS, DEFAULT_SHEET_TITLE);
    }
    public void writeExcelInputData(String fileName, String[] headerList) throws Exception{
        writeExcelInputData(fileName, headerList, DEFAULT_SHEET_TITLE);
    }
    public void writeExcelInputData(String fileName, String sheetTitle) throws Exception{
        writeExcelInputData(fileName, DEFAULT_HEADERS, sheetTitle);
    }
    public void writeExcelInputData(String fileName, String[] headerList, String sheetTitle){
        List<Member> members = InputData.addMember();
        try {
            XSSFWorkbook workbook = getXSSFWorkbook();
            Sheet sheet = getSheet(sheetTitle, workbook);
            createHeaderRows(headerList, sheet);
            createRows(members, sheet);
            createExcelFile(fileName, workbook);
        } catch (IOException ioE){
            ioE.printStackTrace();
        }
    }

    private XSSFWorkbook getXSSFWorkbook(){
        return new XSSFWorkbook();
    }

    private Sheet getSheet(String sheetTitle, XSSFWorkbook workbook){
        return workbook.createSheet(sheetTitle);
    }

    private void createHeaderRows(String[] headerList, Sheet sheet){
        Row headerRow = sheet.createRow(0);
        for(int i=0;i<headerList.length;i++){
            headerRow.createCell(i).setCellValue(headerList[i]);
        }
    }

    private void createRows(List<Member> members, Sheet sheet){
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(member.getName());
            row.createCell(1).setCellValue(member.getAge());
            row.createCell(2).setCellValue(member.getBirthdate());
            row.createCell(3).setCellValue(member.getPhone());
            row.createCell(4).setCellValue(member.getAddress());
            row.createCell(5).setCellValue(member.isMarried());
        }
    }

    private void createExcelFile(String fileName, XSSFWorkbook workbook) throws IOException{
        String filename = "members.xlsx";
        FileOutputStream outputStream = new FileOutputStream(new File(filename));
        workbook.write(outputStream);
        workbook.close();
        System.out.println("엑셀 파일이 저장되었습니다: " + filename);
    }
    public void writeExcel() {
        try {
            writeExcelInputData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
