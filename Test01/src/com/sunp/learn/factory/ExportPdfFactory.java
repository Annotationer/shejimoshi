package com.sunp.learn.factory;

public class ExportPdfFactory implements ExportFactory {



	@Override
	public ExportFile Factory(String type) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub
        if("standard".equals(type)){
            
            return new ExportStandardPdfFile();
            
        }else if("financial".equals(type)){
            
            return new ExportFinancialPdfFile();
            
        }else{
            throw new RuntimeException("没有找到对象");
        }
	}

}
