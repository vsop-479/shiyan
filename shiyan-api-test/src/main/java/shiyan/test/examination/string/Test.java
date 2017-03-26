package shiyan.test.examination.string;

/**
 * Created by Administrator on 2017/1/5.
 */
public class Test {
    public static void main(String[] args){
        System.out.println(charAt(2));
        System.out.println(codePointAt(2));
        System.out.println(codePointBefore(2));
        System.out.println(codePointCount(0, 4));
        System.out.println(concat("efg"));
        System.out.println(copyValueOf(new char[]{'a', 'b', 'c'}));
        System.out.println(copyValueOf(new char[]{'a','b','c','e','f','g'}, 2, 2));
        System.out.println(indexOf('c'));
        System.out.println(intern());
        System.out.println(offsetByCodePoints(1, 3));
    }


    /**
     * Unicode:ascii的扩展，16进制表示
     * 返回index处的字符
     * "abcd".charAt(2)返回c
     * @param index
     * @return
     */
    public static char charAt(int index){
        return "abcd".charAt(2);
    }

    /**
     * 返回指定字符的Unicode
     * c 97
     * @param index
     * @return
     */
    public static int codePointAt(int index){
        return "abcd".codePointAt(2);
    }

    /**
     * 返回指定字符的Unicode
     * b 98
     * @param index
     * @return
     */
    public static int codePointBefore(int index){
        return "abcd".codePointBefore(2);
    }

    /**
     * 返回指定字符串中，Unicode数
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public static int codePointCount(int beginIndex, int endIndex){
        return "abcdef".codePointCount(beginIndex, endIndex);
    }

    /**
     * 将str连接到该字符串末尾
     * @param str
     * @return
     */
    public static String concat(String str){
        return "abc".concat(str);
    }

    /**
     * 将char[]转成string
     * ['a','b','c']
     * "abc"
     * @param data
     * @return
     */
    public static String copyValueOf(char[] data){
        return String.copyValueOf(data);
    }

    /**
     * 取将data偏移offset后，截取count长度的字符串
     * ex:
     * data:['a','b','c','e','f','g']
     * offset:2
     * count:2
     * result:"ce"
     * @param data
     * @param offset 偏移量
     * @param count 长度
     * @return
     */
    public static String copyValueOf(char[] data, int offset, int count){
        return String.copyValueOf(data, offset, count);
    }

    /**
     * 返回char的首次index
     * 'c':2
     * @param ch
     * @return
     */
    public static int indexOf(int ch){
        return "abcd".indexOf(ch);
    }

    /**
     * 返回字符串对象的规范化表示形式
     * @return
     */
    public static String intern(){
        return "abcd".intern();
    }

    /**
     * 返回index开始，偏移codePointOffset个unicode代码点后的index
     * @param index
     * @param codePointOffset
     * @return
     */
    public static int offsetByCodePoints(int index, int codePointOffset){
        return "abcdefg".offsetByCodePoints(index, codePointOffset);
    }
}
