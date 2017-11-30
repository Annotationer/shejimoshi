package com.sunp.learn.factory;

public class ExportStandardHtmlFile implements ExportFile{
	public boolean export(String data){
		System.out.println("输出标准html文件");
		return true;
	}
}
