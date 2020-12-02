package com.tujietg.strategy.demo01;

/**
 * 正常价格
 *
 * @author tujietg
 * @date 12/1/20 7:40 PM
 */
public class EndPrice {

    /**
     * 正常价格
     */
    static class Common implements PriceStrategy {

        @Override
        public Double calPrice(Double initialPrice) {
            return initialPrice;
        }
    }


    /**
     * vip价格
     */
    static class Vip implements PriceStrategy {

        @Override
        public Double calPrice(Double initialPrice) {
            return initialPrice * 0.8;
        }
    }

    /**
     * 高级vip价格
     */
    static class HighVip implements PriceStrategy {

        @Override
        public Double calPrice(Double initialPrice) {
            return initialPrice * 0.6;
        }
    }


}
