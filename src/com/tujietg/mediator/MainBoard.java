package com.tujietg.mediator;

/**
 * @author tujietg
 * @date 12/7/20 2:27 PM
 */
public class MainBoard implements Mediator {

    private CdDriver cdDriver;

    private Cpu cpu;

    private SoundCard soundCard;

    private VideoCard videoCard;

    @Override
    public void change(Colleague colleague) {
        if (colleague instanceof CdDriver) {
            this.operCdDriverReadData((CdDriver) colleague);
        } else if (colleague instanceof Cpu) {
            this.operCpuExecuteData(cpu);
        }
    }


    public void operCdDriverReadData(CdDriver cd) {
        String date = cd.getDate();
        // 得到数据之后 交给cpu处理
        cpu.executeData(date);
    }

    public void operCpuExecuteData(Cpu cpu) {
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        // 调用声卡
        this.soundCard.SoundData(soundData);
        // 调用显卡
        this.videoCard.video(videoData);
    }


    public CdDriver getCdDriver() {
        return cdDriver;
    }

    public void setCdDriver(CdDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}
