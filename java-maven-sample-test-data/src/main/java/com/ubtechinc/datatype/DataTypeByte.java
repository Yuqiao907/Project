package com.ubtechinc.datatype;

import com.ubtechinc.datatype.AbstractDataType;


/**
 * 整数类，byte，在JVM中占用的位数为8，最小整数类型，可以节省内存，-128 到 127
 * 常用于：
 * 1、节省空间
 * 2、与底层二进制交互
 * 3、原始数据处理（图像/音频）
 * 4、I/O 文件处理，序列化：把一个 Java 对象 → 转成 byte[] 或写入文件/网络
 * 5、字节读写和位运算
 */


/**
 * Java 的 输入输出（I/O）类库，包括： •
 * FileOutputStream, ObjectOutputStream：写文件
 * FileInputStream, ObjectInputStream：读文件
 * Serializable：表示该类可以被“序列化”
 */

/**
 *Datatype byte
 * @author MacBook Air
 * @date 2025/7/28 23:44
 */

public class DataTypeByte extends AbstractDataType<Byte> {
    public DataTypeByte(byte defaultByte) {
        super(defaultByte);
    }

    @Override

    public void formalForm() {

    }


    /**
     * 将String转换为byte
     * @param input -string to be converted to byte
     * @return converted byte
     */

    public byte[] myGetBytes(String input) {
        if (input == null) {
            return new byte[0];
        }
        byte[] result = new byte[input.length()];
        for (int i = 0; i < input.length(); i++) {
            char target = input.charAt(i);
            result[i] = (byte) target;
        }
        return result;
    }

    /**
     * 打印byte
     * @param input- byte array to be printed
     */
    public static void printBytes(byte[] input) {
        for (byte i : input) {
            System.out.print(i);
        }
    }


    /**
     *反转byte
     * @param input 原始byte数组
     * @return result
     */

    public static byte[] invertByte(byte[] input) {
        byte[] result = new byte[input.length];
        for (byte i : input) {
            //防止符号位干扰，涉及二进制
            result[i] = (byte) (255 - (input[i] & 0xFF));

        }
        return result;

    }




/*
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
*/

    /*关于序列化，这一块先不搞

    public void writeToFile(String filePath) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(this);
        }
    }


    public static DataTypeByte readFromFile(String filePath) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (DataTypeByte) in.readObject();
        }
    }


*/

}
