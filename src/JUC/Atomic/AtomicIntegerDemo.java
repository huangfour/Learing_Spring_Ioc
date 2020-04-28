package JUC.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : hong.Four
 * @date : 2020-04-25 15:14
 * 演示原子类的基本用法，对比非原子类线程安全问题，使用原子类不需要加锁也可以保证线程安全
 **/

public class AtomicIntegerDemo implements Runnable{
    private static final AtomicInteger atomicInteger =new AtomicInteger();

    public void incrementAtomic() {
        atomicInteger.getAndIncrement();
    }


    private static volatile int basicCount = 0;

    public  void  incrementBasic() {
        basicCount++;
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerDemo r=new AtomicIntegerDemo();
        Runnable target;

        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("原子类："+atomicInteger.get());
        System.out.println("普通类："+basicCount);
    }
    @Override
    public void run() {
        for (int i=0;i<10000;i++) {
            incrementAtomic();
            incrementBasic();
        }

    }
}
