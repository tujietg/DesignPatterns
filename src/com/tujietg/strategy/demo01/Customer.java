package com.tujietg.strategy.demo01;

/**
 * @author tujietg
 * @date 12/1/20 7:53 PM
 */
public class Customer {

    PriceStrategy priceStrategy;

    /**
     * 购买金额
     */
    Double buyPrice;


    void buy(Integer grade, Double buyPrice) {
        this.buyPrice = buyPrice;
        if (grade == 1) {
            // 普通用户
            priceStrategy = new EndPrice.Common();
        } else if (grade == 2) {
            // vip
            priceStrategy = new EndPrice.Vip();
        } else {
            priceStrategy = new EndPrice.HighVip();
        }
    }

    public Double calLastAmount() {
        return priceStrategy.calPrice(buyPrice);
    }

}
