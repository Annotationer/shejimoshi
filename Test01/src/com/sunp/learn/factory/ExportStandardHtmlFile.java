package com.sunp.learn.factory;

public class ExportStandardHtmlFile implements ExportFile{
	public boolean export(String data){
		System.out.println("�����׼html�ļ�");
		return true;
	}
}
