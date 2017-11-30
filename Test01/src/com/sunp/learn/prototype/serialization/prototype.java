package com.sunp.learn.prototype.serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 利用序列化实现深度克隆
 * 把对象写入流中，在反序列化，重建对象
 * @author sunpeng
 *
 */
public class prototype {

	public Object deepClone() throws IOException,ClassNotFoundException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois =new ObjectInputStream(bis);
		return ois.readObject();
		
	}
}
