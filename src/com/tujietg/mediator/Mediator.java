package com.tujietg.mediator;

/**
 * 抽象调停者类
 *
 * @author tujietg
 * @date 12/7/20 2:17 PM
 */
public interface Mediator {

    /**
     * 调停, 负责调控每个同事类之间的协作
     *
     * @param colleague
     */
    void change(Colleague colleague);

}
