package com.sunp.learn.factory;

public class ExportFinancialPdfFile  implements ExportFile{

	public boolean export(String data){
		  System.out.println("���������PDF�ļ�");
	        return true;
	}
}
