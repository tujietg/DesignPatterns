package com.tujietg.msb.singleton;

/**
 * 懒汉式  lazy loading
 * 存在线程不安全问题
 * 通过增加 syn 解决 带来效率下降
 *
 * @author tujietg
 * @date 11/19/20 8:59 AM
 */
public class Demo03 {

    private static Demo03 INSTANCE;

    private Demo03() {
    }

    public static synchronized Demo03 getInstance() throws InterruptedException {
        Thread.sleep(1);
        if (INSTANCE == null) {
            INSTANCE = new Demo03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
