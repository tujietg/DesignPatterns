package com.tujietg.factory.abstractfactory;

/**
 * @author tujietg
 * @date 12/2/20 3:38 PM
 */
public class IPhone extends Phone {

    public IPhone() {
        make();
    }

    @Override
    void make() {
        System.out.println("make iPhone");
    }
}
