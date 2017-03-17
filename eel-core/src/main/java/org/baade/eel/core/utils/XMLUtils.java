package org.baade.eel.core.utils;

import java.io.*;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * XML工具类
 * 
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public class XMLUtils {

	/**
	 * 将对象转成XML的字符串
	 * @param t 对象T
	 * @return 返回对象数据的XML字符串
	 */
	public static <T> String obj2XMLStr(T t) {
		StringWriter stringWriter = new StringWriter();
		obj2Writer(t, stringWriter);
		return stringWriter.toString();
	}
	
	/**
	 * 将对象以XML的形式写到文件中
	 * @param t 对象T
	 */
	public static <T> void obj2XMLFile(T t, String xmlFilePath) {
		FileWriter writer =  null;
		try {
			writer = new FileWriter(xmlFilePath);
			obj2Writer(t, writer);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if(writer != null){try {writer.close();} catch (IOException e) {}}
		}
	}
	
	/**
	 * 将对象t写到输出流中
	 * @param t 对象T
	 * @param writer 输出流
	 * @return 返回的输出流中已经包含对象数据
	 */
	public static <T> Writer obj2Writer(T t, Writer writer) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(t.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();

			// 格式化xml输出的格式
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshaller.marshal(t, writer);
			return writer;
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 将XML转换成对象
	 * @param clazz 对象T的class
	 * @param xmlPath XML的文件路径
	 * @return 返回对象T的实例
	 */
	@SuppressWarnings("unchecked")
	public static <T> T xmlFile2Obj(Class<T> clazz, String xmlPath) {
		InputStream inputStream = null;
		try {
			JAXBContext context = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			inputStream =XMLUtils.class.getResourceAsStream(xmlPath);
//					inputStream = XMLUtils.class.getResource(xmlPath);
			return (T)unmarshaller.unmarshal(inputStream);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		} finally{
			if(inputStream != null){try {inputStream.close();} catch (IOException e) {}}
		}
	}


}
