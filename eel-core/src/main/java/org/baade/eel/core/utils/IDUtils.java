package org.baade.eel.core.utils;

import java.util.UUID;

/**
 * ID生成工具
 * Created by zz on 2017/5/27.
 */
public class IDUtils {

    /**
     * id字符串的数组
     */
    private static final String[] CHARACTERS = new String[]{
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",

            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",

            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
    };

    /**
     * 生成一个唯一的id
     * @param fixNums 区服的信息
     * @return 唯一的id
     */
    public static String generate(int... fixNums){
        String fixNumsStr = "";
        if (fixNums != null){
            for (int i = 0; i < fixNums.length; i++) {
                String hexStr = int2Hex(fixNums[i]);
                fixNumsStr += hexStr;
            }
        }

        String uuidStr = UUID.randomUUID().toString().replace("-", "");
        return hex2Str(fixNumsStr + uuidStr);
    }

    /**
     * 生成一个唯一的id
     * @return 唯一的id
     */
    public static String generate(){
        return generate(null);
    }

    /**
     * 将int转成4位的16进制数
     * 注：该int值不能大于65535（因为大于65535的int值，4位的16进制数就存不下了）
     * @param i int值
     * @return 4位的16进制数
     */
    private static String int2Hex(int i){
        String hexStr = Integer.toHexString(i);
        while (hexStr.length() < 4) {
            hexStr = "0" + hexStr;
        }
        return hexStr;
    }

    /**
     * 将16进制的字符串按每4位转换成id字符串
     * @param str 16进制的字符串
     * @return id字符串
     */
    private static String hex2Str(String str){
        StringBuffer buff = new StringBuffer();
        while (str.length() >= 4){
            String s = str.substring(0, 4);
            int index = Integer.parseInt(s, 16);
            buff.append(CHARACTERS[index % CHARACTERS.length]);
            str = str.substring(4);
        }
        return buff.toString();
    }

}
