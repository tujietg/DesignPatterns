package com.tujietg.factory.factorymethod;

/**
 * @author tujietg
 * @date 12/2/20 3:02 PM
 */
public class BroomFactory {

    public Moveable create() {
        System.out.println("前置操作");
        return new Broom();
    }

}
