package com.tujietg.mediator;

/**
 * @author tujietg
 * @date 12/7/20 2:23 PM
 */
public class Cpu extends Colleague {

    private String videoData;

    private String soundData;

    public Cpu(Mediator mediator) {
        super(mediator);
    }


    public void executeData(String data) {
        String[] split = data.split(",");
        this.soundData = split[1];
        this.videoData = split[0];

        getMediator().change(this);
    }


    public String getVideoData() {
        return videoData;
    }

    public void setVideoData(String videoData) {
        this.videoData = videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void setSoundData(String soundData) {
        this.soundData = soundData;
    }
}
