package com.sunp.learn.factory;

public class ExportFinancialHtmlFile implements ExportFile {

	public boolean export(String data){
		System.out.println("���������HTML�ļ�");
		return true;
	}
}
