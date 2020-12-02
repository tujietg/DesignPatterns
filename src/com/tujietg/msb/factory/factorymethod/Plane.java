package com.tujietg.msb.factory.factorymethod;


/**
 * @author tujietg
 * @date 12/2/20 2:23 PM
 */
public class Plane implements Moveable {
    @Override
    public void go() {
        System.out.println("开飞机");
    }
}
