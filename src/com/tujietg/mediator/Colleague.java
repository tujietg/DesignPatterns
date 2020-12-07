package com.tujietg.mediator;

/**
 * 同事抽象类
 *
 * @author tujietg
 * @date 12/7/20 2:18 PM
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
