package com.tujietg.factory.abstractfactory;

/**
 * @author tujietg
 * @date 12/2/20 3:39 PM
 */
public class XiaoMiPhone extends Phone {

    public XiaoMiPhone() {
        make();
    }

    @Override
    void make() {
        System.out.println("make xiaomi phone");
    }
}
