package com.tujietg.wrapper;

/**
 * @author tujietg
 * @date 12/9/20 10:08 AM
 */
public abstract class Fours implements Car {

    private Car car;

    Fours(Car car) {
        this.car = car;
    }

    @Override
    public void skin() {
        car.skin();
    }

}
