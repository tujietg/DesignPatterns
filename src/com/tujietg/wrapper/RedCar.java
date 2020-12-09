package com.tujietg.wrapper;

/**
 * @author tujietg
 * @date 12/9/20 10:12 AM
 */
public class RedCar extends Fours {

    public RedCar(Car car) {
        super(car);
    }

    @Override
    public void skin() {
        super.skin();
        System.out.println("4s店让m4变成红色");
    }


}
