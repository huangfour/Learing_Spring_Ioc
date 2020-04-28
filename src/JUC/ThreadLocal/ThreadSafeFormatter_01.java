package JUC.ThreadLocal;

import java.text.SimpleDateFormat;

/**
 * @author : hong.Four
 * @date : 2020-04-25 14:13
 **/
public class ThreadSafeFormatter_01 {
    //利用ThreadLocal返回一个线程安全的SimpleDateFormat对象
    //另外一个local变量
    public static ThreadLocal<String>
            dataFormatThreadLocal =new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "参数";
        }
    };
}
