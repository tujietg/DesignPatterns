package com.tujietg.msb.singleton;

/**
 * 懒汉式  lazy loading
 * 存在线程不安全问题
 *
 * @author tujietg
 * @date 11/19/20 8:49 AM
 */
public class Demo02 {

    private static Demo02 INSTANCE;

    private Demo02() {
    }

    public static Demo02 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Demo02();
        }
        return INSTANCE;
    }

    /**
     * 验证线程不安全性 地址不一样
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getInstance());
            }).start();
        }
    }
}
