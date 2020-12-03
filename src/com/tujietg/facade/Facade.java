package com.tujietg.facade;

/**
 * @author tujietg
 * @date 12/3/20 9:44 PM
 */
public class Facade {

    private TV tv;
    private Light light1, light2, light3;
    private Heater heater;


    public Facade() {
        light1 = new Light();
        light2 = new Light();
        light3 = new Light();
        tv = new TV();
        heater = new Heater();
    }

    public void open() {
        light1.open();
        light2.open();
        light3.open();
        tv.open();
        heater.open();
    }


}
