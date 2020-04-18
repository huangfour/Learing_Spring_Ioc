package JUC.ThreadLocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : hong.Four
 * @date : 2020-04-17 10:57
 **/

//每个线程需要一个独享对象，应用场景(利用ThreadLocal，给每个线程分配自己的对象)

public class ThreadLocalTest {

    public static ExecutorService pool=Executors.newFixedThreadPool(10);

    //每个线程打印自己的时间
    //利用ThreadLocal为线程池当中的coreThread线程创建一个属于自己的对象。
    public static String date(int seconds) {
        Date date = new Date(1000 * seconds);
        SimpleDateFormat dataFormat=ThreadSafeFormatter.dataFormatThreadLocal.get();
        return dataFormat.format(date);
    }


    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<1000;i++){
            int finalId = i;

            pool.submit(new Runnable() {
                @Override
                public void run() {
                    String date=ThreadLocalTest.date(finalId);
                    System.out.println(date+" , "+Thread.currentThread().getId());
                }
            });

        }
        pool.shutdown();
    }

}
