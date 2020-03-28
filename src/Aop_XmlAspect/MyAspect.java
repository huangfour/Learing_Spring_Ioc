package Aop_XmlAspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author : hong.Four
 * @date : 2020-03-28 13:53
 **/
public class MyAspect {
    //前置通知
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("------------------------------------------------");
        System.out.println("前置通知：模拟执行权限检查...");
        System.out.println("目标类是： " + joinPoint.getTarget());
        System.out.println("被织入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    //后置通知
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("------------------------------------------------");
        System.out.println("后置通知：模拟记录日志...");
        System.out.println("目标类是： " + joinPoint.getTarget());
        System.out.println("被织入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     * roceedingJoinPoint 是joinPoint子接口，表示可以执行目标方法
     * 1.必须是object类型返回值
     * 2.必须接受一个参数，类型为ProceedingJoinPoint
     * 3.必须throws Throwable
     */
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("------------------------------------------------");
        //开始
        System.out.println("环绕开始：执行目标方法之前，模拟开启事务...");
        //执行当前目标方法
        Object obj = proceedingJoinPoint.proceed();
        //结束
        System.out.println("环绕结束：执行目标方法之后，模拟关闭事务...");
        return obj;
    }

    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("------------------------------------------------");
        System.out.println("异常通知：" + "出错了" + e.getMessage());
    }

    //最终通知
    public void myAfter() {
        System.out.println("------------------------------------------------");
        System.out.println("最终通知：模拟方法结束后释放资源");

    }

}
