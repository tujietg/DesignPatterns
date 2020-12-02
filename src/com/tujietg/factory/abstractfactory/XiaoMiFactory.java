package com.tujietg.factory.abstractfactory;

/**
 * @author tujietg
 * @date 12/2/20 3:41 PM
 */
public class XiaoMiFactory extends AbstractFactory {

    @Override
    Phone makePhone() {
        return new XiaoMiPhone();
    }

    @Override
    PC makePC() {
        return new xiaoMiPc();
    }
}
