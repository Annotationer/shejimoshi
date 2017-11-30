package com.sunp.learn.factory;

public class ExportHtmlFactory implements ExportFactory {

	@Override
	public ExportFile Factory(String type) {
		// TODO Auto-generated method stub
		if("standard".equals(type)){
			return new ExportStandardHtmlFile();
		}else if("financial".equals(type)){
            
            return new ExportFinancialHtmlFile();
            
        }else{
            throw new RuntimeException("没有找到对象");
        }
		
	}

}
