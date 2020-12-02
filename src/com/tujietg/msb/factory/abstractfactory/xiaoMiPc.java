package com.tujietg.msb.factory.abstractfactory;

/**
 * @author tujietg
 * @date 12/2/20 3:35 PM
 */
public class xiaoMiPc extends PC {


    public xiaoMiPc() {
        make();
    }

    @Override
    void make() {
        System.out.println("make xiaomi pc");
    }

}
