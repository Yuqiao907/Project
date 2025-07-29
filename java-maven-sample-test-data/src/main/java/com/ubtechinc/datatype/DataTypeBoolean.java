package com.ubtechinc.datatype;
import com.ubtechinc.datatype.AbstractDataType;
/**
 * 1 bit 的逻辑变量，JVM 实际将 boolean 作为 int（4 字节）来处理
 *
 */

public class DataTypeBoolean extends AbstractDataType <Boolean>{

public DataTypeBoolean( boolean defaultBool) {
    super( defaultBool );
}

    /**
     * 判断密码强度
     * @param password
     * @return boolean
     */
    public static boolean strongPasswordValidate(String password){
    if (password.length()<8 || password == null){
        return false;
    }
//局部变量必须initialize
    boolean uppercase = false;
    boolean lowercase = false;
    boolean number = false;

    for(char c:password.toCharArray()){
        if(Character.isUpperCase(c)){uppercase=true;}
        else if(Character.isLowerCase(c)){lowercase=true;}
        else if(Character.isDigit(c)){number=true;}

}
    return uppercase&&lowercase&&number;
}

    /**
     *将boolean值转换为string的true false
     * @param target
     * @return string
     */
    public String toString(boolean target) {
        return target?"true":"false";
    }

    /**
     * 比较两个boolean值的大小，虽然 boolean 本身不是数值类型但其有隐式数值0（false）、1（true），true>false
     * @param x
     * @param y
     * @return int 相等输出0，不相等，x位true输出1，不然输出-1
     */
    public static int compare(boolean x, boolean y) {
        return (x == y) ? 0 : (x ? 1 : -1);
    }

    /**
     *
     * @param other 比较对象
     * @return boolean
     */
   public boolean equals(boolean other) {
//        确认内容不为空
//        这里由于继承了抽象类，default value被自动装箱成了Boolean包装类，所以可以用Boolean里面的equal方法
       return defaultValue != null && defaultValue.equals(other);
   }

   /**
    * 以下是equals在Boolean中的源码
    *
    * public final class Boolean implements java.io.Serializable, Comparable<Boolean> {
    *     private final boolean value;
    *
    *     public boolean booleanValue() {
    *         return value;
    *     }
    *
    *     public boolean equals(Object obj) {
    *         if (obj instanceof Boolean) {
    *             return value == ((Boolean)obj).booleanValue();
    *         }
    *         return false;
    *     }
    * }
    */




    public void formalForm() {

    }
}
