package com.tujietg.factory.factorymethod;

/**
 * 任意定制交通工具生产过程
 * 产品一组扩展很方便
 * CarFactory().create();
 *
 * @author tujietg
 * @date 12/2/20 3:04 PM
 */
public class Main {

    public static void main(String[] args) {
        Moveable moveable = new CarFactory().create();
        moveable.go();
    }

}
