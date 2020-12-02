package com.tujietg.strategy.demo01;

/**
 * 商场针对不同的会员给出不同的折扣
 * 策略模式的实现
 *
 * @author tujietg
 * @date 12/1/20 9:28 PM
 */
public class Client {


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy(1, 2000D);
        System.out.println(customer.calLastAmount());

        customer.buy(2, 2000D);
        System.out.println(customer.calLastAmount());

        customer.buy(3, 2000D);
        System.out.println(customer.calLastAmount());


    }


}
