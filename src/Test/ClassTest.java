package Test; /**
 * @author : hong.Four
 * @date : 2020-04-16 15:11
 **/

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {

    private ClassTest() {}
    public ClassTest(String name) {
        System.out.println("执行有参数构造器");
    }
    public void info() {
        System.out.println("执行无参info");
    }
    public void info(String str) {
        System.out.println("执行有参数info");
    }

    class Inner {}

    public static void main(String[] args) throws Exception{
        //获取ClassTest在JVM中对应的Class实例
        Class<ClassTest> clazz = ClassTest.class;
        //获取clazz对应类的全部构造器
        Constructor[] ctors = clazz.getDeclaredConstructors();
        System.out.println("ClassTest的全部构造器如下：");
        for (Constructor c: ctors) {
            System.out.println(c);
        }
        //获取所有public构造器
        Constructor[] publicCtors = clazz.getConstructors();
        System.out.println("ClassTest的全部public构造器如下：");
        for (Constructor c: publicCtors) {
            System.out.println(c);
        }
        //获取所有public方法
        Method[] mtds = clazz.getMethods();
        System.out.println("ClassTest所有public方法如下：");
        for (Method md : mtds) {
            System.out.println(md);
        }
        //获取指定方法
        System.out.println("ClassTest中带一个字符串参数的info方法： " + clazz.getMethod("info", String.class));
        //获取全部注解
        Annotation[] anns = clazz.getAnnotations();
        System.out.println("ClassTest全部注解如下： ");
        for (Annotation an :  anns) {
            System.out.println(an);
        }
        //    System.out.println("ClassTest类的@SuppressWarning注解为： " + Arrays.toString(clazz.getAnno))
        //获取全部内部类
        Class<?>[] inners = clazz.getDeclaredClasses();
        System.out.println("ClassTest所有内部类： ");
        for (Class<?> c :  inners) {
            System.out.println(c);
        }
        //使用forName()加载内部类
        //Class inClazz = Class.forName("test.ClassTest$Inner");
        //通过getDeclaringClass()访问该类所在的外部类
        //System.out.println("inClazz对应的外部类： " + inClazz.getDeclaringClass());
        System.out.println("ClassTest的包为： " + clazz.getPackage());
        System.out.println("ClassTest的父类为： " + clazz.getSuperclass());
    }
}