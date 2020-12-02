package com.tujietg.msb.factory.simplefactory;

import com.tujietg.msb.factory.factorymethod.Broom;
import com.tujietg.msb.factory.factorymethod.Car;
import com.tujietg.msb.factory.factorymethod.Plane;

/**
 * 简单工厂模式
 * 存在
 *
 * @author tujietg
 * @date 12/2/20 2:21 PM
 */
public class SimpleFactory {

    public Car createCar() {
        System.out.println("前置操作");
        return new Car();
    }

    public Plane createPlane() {
        System.out.println("前置操作");
        return new Plane();
    }

    public Broom createBroom() {
        System.out.println("前置操作");
        return new Broom();
    }

}
