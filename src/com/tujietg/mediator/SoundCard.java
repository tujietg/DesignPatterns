package com.tujietg.mediator;

/**
 * @author tujietg
 * @date 12/7/20 2:35 PM
 */
public class SoundCard extends Colleague {


    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void SoundData(String data) {
        System.out.println("声音是：" + data);
    }

}
