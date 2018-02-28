package com.sunp.learn.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) throws Exception{
		String classPath="com.sunp.learn.annotation.ApplyFileItem";
		String property = "extra";
		System.out.println(new Test().countLength(classPath,property,CChar.class));
	}
	
	/**
	 * @param classPath  类的路径 如：com.package.Test
	 * @param property	 属性
	 * @param annotation	属性上的注释
	 * @return
	 * @throws Exception 
	 * 属性不输入计算全部长度
	 */
	public int countLength(String classPath, String property,Class<CChar> annotation ) throws Exception{
		if(classPath.trim().length() == 0 || classPath == null)
			throw new Exception("类路径不能为空！");
		if(annotation == null)
			throw new Exception("注释不能为空！");
		final Class cls = Class.forName(classPath);
		Field[] fs =  cls.getDeclaredFields();
		int count = 0;
		for(Field field :fs){
			if(!field.getName().equals(property)){
				CChar cchar = (CChar) field.getAnnotation(annotation);
				count +=cchar.value();
			}else{
				break;
			}
		}
		return count;
	}
}
