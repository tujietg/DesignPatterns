package com.tujietg.singleton;

/**
 * 懒汉式  lazy loading
 * 存在线程不安全问题
 * 通过增加 syn 解决 带来效率下降
 * 减少锁的颗粒度 , 此写法 线程安全
 * 双重检查模式
 *
 * @author tujietg
 * @date 11/19/20 9:32 AM
 */
public class Demo05 {

    /**
     * 这里必须增加volatile 禁止指令重排序
     */
    private static volatile Demo05 INSTANCE;

    private Demo05() {
    }


    public static Demo05 getInstance() {
        // 这次判断是为了 提高效率
        if (INSTANCE == null) {
            synchronized (Demo05.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Demo05();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getInstance());
            }).start();
        }
    }

}
