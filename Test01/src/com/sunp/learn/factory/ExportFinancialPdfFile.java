package com.sunp.learn.factory;

public class ExportFinancialPdfFile  implements ExportFile{

	public boolean export(String data){
		  System.out.println("导出财务版PDF文件");
	        return true;
	}
}
