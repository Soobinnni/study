package kr.excel.example;

import kr.excel.example.util.ExcelReader;
import kr.excel.example.util.ExcelWriter;

public class ExcelMain {
    public static void main(String[] args) {
        // 파일 읽기
        String readFileName = "example.xlsx";
        ExcelReader er = new ExcelReader(readFileName);
        er.readExcel();

        // 파일 생성
        String writeFileName = "member.xlsx";
        ExcelWriter ew = new ExcelWriter(writeFileName);
        ew.writeExcel();
    }
}
