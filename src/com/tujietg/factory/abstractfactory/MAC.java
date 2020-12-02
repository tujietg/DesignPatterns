package com.tujietg.factory.abstractfactory;

/**
 * @author tujietg
 * @date 12/2/20 3:36 PM
 */
public class MAC extends PC {

    public MAC() {
        make();
    }

    @Override
    void make() {
        System.out.println("make pc");
    }

}
