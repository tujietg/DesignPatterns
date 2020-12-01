package com.tujietg.msb.strategy.demo01;

/**
 * 价格策略接口
 *
 * @author tujietg
 * @date 12/1/20 7:40 PM
 */
public interface PriceStrategy {

    /**
     * 初始价格
     *
     * @param initialPrice
     * @return
     */
    Double calPrice(Double initialPrice);

}
