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
	 * @param classPath  ���·�� �磺com.package.Test
	 * @param property	 ����
	 * @param annotation	�����ϵ�ע��
	 * @return
	 * @throws Exception 
	 * ���Բ��������ȫ������
	 */
	public int countLength(String classPath, String property,Class<CChar> annotation ) throws Exception{
		if(classPath.trim().length() == 0 || classPath == null)
			throw new Exception("��·������Ϊ�գ�");
		if(annotation == null)
			throw new Exception("ע�Ͳ���Ϊ�գ�");
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
