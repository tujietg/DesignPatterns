package com.tujietg.facade;

/**
 * 门面模式（外观模式）
 * 外部与子系统的通信必须通过一个的外观对象进行。
 * Demo:回家之后需要 打开3个light，TV，heater,
 *
 * @author tujietg
 * @date 12/3/20 9:38 PM
 */
public class Main {

    public static void main(String[] args) {
        // 只需要操作门面就可以完成全部的任务
        Facade facade = new Facade();
        facade.open();
    }
}
