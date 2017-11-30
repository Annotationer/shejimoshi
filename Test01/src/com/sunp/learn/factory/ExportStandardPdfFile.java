package com.sunp.learn.factory;

public class ExportStandardPdfFile implements ExportFile{

	public boolean export(String data){
		System.out.println("输出标准PDF文件");
		return true;
		
	}
}
