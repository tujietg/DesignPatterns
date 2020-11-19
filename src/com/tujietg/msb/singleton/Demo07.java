package com.tujietg.msb.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化
 *
 *
 *
 * @author tujietg
 * @date 11/19/20 9:40 AM
 */
public enum Demo07 {

    INSTANCE;

    public void m() {
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo07.INSTANCE.hashCode());
            }).start();
        }
    }


}
