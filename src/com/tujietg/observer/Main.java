package com.tujietg.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式：
 * 每一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。
 *
 * @author tujietg
 * @date 12/10/20 10:56 AM
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.cry();
    }
}

/**
 * 观察者接口
 */
interface Observer {
    void action();
}

class father implements Observer {

    @Override
    public void action() {
        heat();
    }

    private void heat() {
        System.out.println("娃哭的时候 爸爸揍起来");
    }
}

class mother implements Observer {

    @Override
    public void action() {
        hold();
    }

    private void hold() {
        System.out.println("娃哭的时候 妈妈抱起来");
    }
}


class dog implements Observer {

    @Override
    public void action() {
        call();
    }

    private void call() {
        System.out.println("娃哭的时候 狗汪汪汪～");
    }

}


class Child {
    private List<Observer> list = new ArrayList<>();

    {
        list.add(new father());
        list.add(new mother());
        list.add(new dog());
    }

    void cry() {
        System.out.println("小孩子哇哇哇");
        list.forEach(item -> item.action());
    }
}




