package com.tujietg.msb.factory.abstractfactory;

/**
 * @author tujietg
 * @date 12/2/20 3:42 PM
 */
public class AppleFactory extends AbstractFactory {

    @Override
    Phone makePhone() {
        return new IPhone();
    }

    @Override
    PC makePC() {
        return new MAC();
    }
}
