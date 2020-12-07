package com.tujietg.mediator;

/**
 * @author tujietg
 * @date 12/7/20 2:37 PM
 */
public class VideoCard extends Colleague {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void video(String data) {
        System.out.println("播放视频：" + data);
    }

}
