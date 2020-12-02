package com.tujietg.msb.factory.factorymethod;

/**
 * 汽车工厂
 *
 * @author tujietg
 * @date 12/2/20 2:57 PM
 */
public class CarFactory {

    public Moveable create() {
        System.out.println("前置操作");
        return new Car();
    }

}
