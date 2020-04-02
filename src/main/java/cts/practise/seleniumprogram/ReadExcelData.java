package cts.practise.seleniumprogram;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

public static void main(String[] args) {
// TODO Auto-generated method stub
ExcelDataConfig excel=new ExcelDataConfig("C:\\\\Users\\\\AFREEN\\\\eclipse-workspace\\\\cts-Sample-selinium\\\\src\\\\test\\\\resources\\\\Excel\\\\Excelselinium.xlsx");
System.out.println(excel.getData(0, 0, 0));
System.out.println(excel.getData(0, 0, 1));
}

}

