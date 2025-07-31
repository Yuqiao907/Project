package com.ubtechinc.process;

import com.ubtechinc.datatype.DataTypeInteger;
import com.ubtechinc.datatype.DataTypeString;
import com.ubtechinc.datatype.DataTypeDouble;
//这一行其实不用加
import com.ubtechinc.datatype.AbstractDataType;


/**
 * public类根据生日自动生成密码
 *
 * @author MacBook Air
 * @date 2025/7/28 23:57
 */

public class GenerateOwnPassword {

    private final DataTypeString username;
    private final DataTypeInteger birthmonth;
    private final DataTypeInteger birthday;

    public GenerateOwnPassword(String username, int password, int birthday, int birthmonth) {
        this.username = new DataTypeString(username);
        this.birthday = new DataTypeInteger(birthday);
        this.birthmonth = new DataTypeInteger(birthmonth);

    }

    /**
     * @return String 最终生成的密码
     */
    public String generate() {
        int password = birthday.square() + birthmonth.randomMultiply();
        username.formalForm();
        //多态
        String formalUsername = username.getDefault();
        //静态方法用类名调用
        double newDouble = DataTypeDouble.multiplyDouble(3.00, 4.00);
        //涉及到string,整个结果转换为string类型
        return formalUsername + password + newDouble;
    }


}
