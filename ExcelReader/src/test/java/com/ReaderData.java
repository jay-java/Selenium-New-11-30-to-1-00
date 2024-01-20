package com;

public class ReaderData {
	public static void main(String[] args) {
		ExcellReader e = new ExcellReader("C:\\Users\\jay-pc\\Desktop\\ExcelReader.xlsx", "login");
		int row = e.rowCount();
		System.out.println("total row : "+row);
		int col = e.colCount();
		System.out.println("total col : "+col);
		String data = e.getData(row, col);
	}
}
