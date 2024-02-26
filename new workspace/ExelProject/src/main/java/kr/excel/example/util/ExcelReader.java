package kr.excel.example.util;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    private String fileName;
    private final static int DEFAULT_INDEX = 0;
    public ExcelReader(String fileName) {
        this.fileName = fileName;
    }

    public FileInputStream getFileInputStream() throws IOException {
        if(this.fileName == null){
            throw new IOException("파일 명 없음");
        }
        return getFileInputStream(this.fileName);
    }

    public FileInputStream getFileInputStream(String fileName) throws IOException {
        // file객체를 생성하여 file stream 과 연결(FileInputStream: 파일에서 데이터를 바이트 스트림으로 읽어오는 데 사용)
        FileInputStream file = new FileInputStream(new File(fileName));
        return file;
    }

    public Workbook getWorkbook(FileInputStream file) throws IOException {
        // (실제 excel파일인)file객체를 다루기 위해선, 가상의 엑셀파일을 메모리에 로드할 필요가 있는데 이를 workbook이라 한다.
        // workbook은 엑셀 파일 전체를 나타내는 객체며 엑셀 파일의 내용은 실제로 메모리에 로드된 후에 Workbook 객체에 저장된다.
        Workbook workbook = WorkbookFactory.create(file);
        return workbook;
    }

    public Sheet getSheetOfIndex(Workbook workbook, int index) {
        return workbook.getSheetAt(index);
    }
    public void printSheetValue(Sheet sheet) {
            for (Row row : sheet) {
                for (Cell cell : row) {
                    String value = FormatData.getCellValue(cell);
                    System.out.print(value+"\t");
                }
                System.out.println();
            }
            System.out.println("엑셀에서 읽어오기 성공!");
    }

    public void readExcel(){
        readExcel(DEFAULT_INDEX);
    }

    public void readExcel(int index){
        ExcelReader er = new ExcelReader(this.fileName);
        try {
            FileInputStream file = er.getFileInputStream();
            Workbook workbook = er.getWorkbook(file);
            Sheet sheet = er.getSheetOfIndex(workbook, index);
            er.printSheetValue(sheet);
        } catch (IOException ioE){
            ioE.getStackTrace();
        }
    }

}
