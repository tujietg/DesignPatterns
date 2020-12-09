package com.tujietg.mediator;

/**
 * 调停者模式：
 * 封装一组对象的交互，降低对象间的耦合度
 * <p>
 * 例子：主板的作用是封装 cpu ，cd， 声卡，显卡的交互
 *
 * @author tujietg
 * @date 12/7/20 2:44 PM
 */
public class Main {

    public static void main(String[] args) {

        // 创建调停者——主板
        MainBoard mainBoard = new MainBoard();

        // 创建同事类
        Cpu cpu = new Cpu(mainBoard);
        CdDriver cdDriver = new CdDriver(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);
        VideoCard videoCard = new VideoCard(mainBoard);

        // 调停者 通知所有的同事
        mainBoard.setCpu(cpu);
        mainBoard.setCdDriver(cdDriver);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setVideoCard(videoCard);

        cdDriver.redaCD();
    }

}

