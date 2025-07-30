package com.ubtechinc.datatype;
import com.ubtechinc.datatype.AbstractDataType;

/**
 * 用于表示 Unicode 字符，占 16 位（2 字节）的存储空间，取值范围为 0 到 65,535。
 * int和char方便互转
 */

/**
 *public datatype char
 * @author MacBook Air
 * @date 2025/7/29 22:01
 */

public class DataTypeChar extends AbstractDataType <Character> {


    private int defaultInt;

    public DataTypeChar( char defaultChar) {

        super( defaultChar);
        this.defaultInt = 0;
    }

    @Override
    public void formalForm() {

    }




    /**
     * 把最后一个char提取出来转换成对应ASCII数字
     * @param target -string with its last char to extract
     */
    public void lastExtract (String target) {

        char lastTarget = target.charAt(target.length() - 1);
        this.defaultInt = (int) lastTarget;


    }

    /**
     * @return default integer*/

    public int getDefaultInt() {
        return defaultInt;
    }

    /**
     * ASCII char 转换成对应整数
     * @param codePoint- char to be converted to integer
     * @return - converted integer
     */
    public static int getNumericValue(char codePoint) {
        // 快速处理 0-9
        if (codePoint >= '0' && codePoint <= '9') {
            return codePoint - '0';
        }

        // 处理 A-Z（返回 10-35）
        if (codePoint >= 'A' && codePoint <= 'Z') {
            return codePoint - 'A' + 10;
        }

        // 处理 a-z（返回 10-35）
        if (codePoint >= 'a' && codePoint <= 'z') {
            return codePoint - 'a' + 10;
        }
        return 0;
    }


    }







