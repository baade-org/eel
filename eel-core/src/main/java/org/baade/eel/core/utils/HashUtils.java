package org.baade.eel.core.utils;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * hash工具类
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public class HashUtils {

	/**
	 * 返回字符串的hash的整型值
	 * @param str
	 * @return
	 */
	public static int md5Int(String str){
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] bytes = md.digest();
			ByteBuffer buffer = ByteBuffer.allocate(16); 
	        buffer.put(bytes, 0, 16);
	        buffer.flip();//need flip 
	        return Math.abs(buffer.getInt());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return 0;
		}

	}
}
