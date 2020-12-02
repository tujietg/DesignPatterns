package com.tujietg.factory.abstractfactory;

/**
 * 任意定制产品一族
 * <p>
 * Demo: 工厂生产 小米的手机和电脑  苹果的手机和电脑
 *
 * @author tujietg
 * @date 12/2/20 3:14 PM
 */
public class Main {
    public static void main(String[] args) {
        // apple工厂
        AbstractFactory appleFactory = new AppleFactory();
        appleFactory.makePC();
        appleFactory.makePhone();

        // 小米工厂
        AbstractFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.makePC();
        xiaoMiFactory.makePhone();
    }
}
