package com.tujietg.msb.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时 不会加载内部类，这样可以实现懒加载
 *
 * @author tujietg
 * @date 11/19/20 9:35 AM
 */
public class Demo06 {

    private Demo06() {
    }

    private static class Demo06Holder {
        private static final Demo06 INSTANCE = new Demo06();
    }

    public static Demo06 getInstance() {
        return Demo06Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getInstance());
            }).start();
        }
    }

}
