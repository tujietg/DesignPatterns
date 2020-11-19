package com.tujietg.msb.singleton;

/**
 * 懒汉式  lazy loading
 * 存在线程不安全问题
 * 通过增加 syn 解决 带来效率下降
 * 减少锁的颗粒度 , 此写法 线程不安全
 *
 * @author tujietg
 * @date 11/19/20 9:06 AM
 */
public class Demo04 {

    private static Demo04 INSTANCE;


    private Demo04() {
    }


    public static Demo04 getInstance() {
        if (INSTANCE == null) {
            synchronized (Demo04.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Demo04();
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
