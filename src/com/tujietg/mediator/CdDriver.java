package com.tujietg.mediator;

/**
 * @author tujietg
 * @date 12/7/20 2:19 PM
 */
public class CdDriver extends Colleague {


    private String date = "";

    public CdDriver(Mediator mediator) {
        super(mediator);
    }


    public void redaCD() {
        this.date = "《奥特曼》, 我要变身了";
        getMediator().change(this);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
