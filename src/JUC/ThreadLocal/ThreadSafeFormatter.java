package JUC.ThreadLocal;

import java.text.SimpleDateFormat;

/**
 * @author : hong.Four
 * @date : 2020-04-17 11:54
 **/
public class ThreadSafeFormatter {
//    利用ThreadLocal返回一个线程安全的SimpleDateFormat对象

    public static ThreadLocal<SimpleDateFormat>
            dataFormatThreadLocal =new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }
    };

}
