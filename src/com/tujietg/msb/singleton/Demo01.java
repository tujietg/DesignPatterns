package com.tujietg.msb.singleton;

/**
 * 单例模式一共7中写法
 * 饿汉式
 * 类加载到内存之后，就实例化一个一个单例 JVM保证线程安全
 * 简单实用，推荐使用。
 * 缺点：无论该类你是否使用 都会创建该对象
 *
 * @author tujietg
 * @date 11/19/20 8:41 AM
 */
public class Demo01 {

    // 两种一样的
    //  private static final Demo01 INSTANCE = new Demo01();

    private static final Demo01 INSTANCE;

    static {
        INSTANCE = new Demo01();
    }

    private Demo01() {
    }

    public static Demo01 getInstance() {
        return Demo01.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo01.getInstance());
            }).start();
        }
    }


}
