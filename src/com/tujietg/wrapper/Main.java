package com.tujietg.wrapper;

/**
 * 动态地给一个对象添加一些额外的职责。
 * 在不想增加子类的情况下扩展类。
 *
 * @author tujietg
 * @date 12/9/20 10:14 AM
 */
public class Main {

    public static void main(String[] args) {
        Car m4 = new M4();
        m4.skin();
        System.out.println("———————————— 4S店 ————————————");
        RedCar redCar = new RedCar(m4);
        redCar.skin();
    }

}
