package com.tujietg.msb.factory.factorymethod;

/**
 * @author tujietg
 * @date 12/2/20 2:24 PM
 */
public class Broom implements Moveable {
    @Override
    public void go() {
        System.out.println("开扫把");
    }
}
