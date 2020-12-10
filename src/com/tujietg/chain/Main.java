package com.tujietg.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式的作用是 封装变化的部分
 * <p>
 * 责任链模式：
 * 对一个对象或者请求进行一系列的处理，这些处理逻辑正好组成一个链条。
 *
 * @author tujietg
 * @date 12/9/20 10:32 AM
 */
public class Main {


    public static void main(String[] args) {
        Message msg = new Message();
        msg.setName("AA").setMsg("hello , 我是中国的程序员，<html> ,我正在享受着996");

        Filter htmlFilter = new HtmlFilter();
        WordFilter wordFilter = new WordFilter();

        FilterChain filterChain = new FilterChain()
                .add(htmlFilter).add(wordFilter);

        filterChain.doFilter(msg);

        System.out.println(msg.getMsg());
    }

}

interface Filter {

    void doFilter(Message msg);
}

class FilterChain implements Filter {

    private List<Filter> list = new ArrayList<>();

    FilterChain add(Filter filter) {
        list.add(filter);
        return this;
    }

    @Override
    public void doFilter(Message msg) {
        list.forEach(item -> item.doFilter(msg));
    }
}

class HtmlFilter implements Filter {

    @Override
    public void doFilter(Message msg) {
        // 处理攻击
        String replace = msg.getMsg().replace("<", "[").replace(">", "]");
        msg.setMsg(replace);
    }
}


class WordFilter implements Filter {

    @Override
    public void doFilter(Message msg) {
        // 处理敏感语句
        String replace1 = msg.getMsg().replace("996", "955");
        msg.setMsg(replace1);
    }
}


class Message {

    private String name;

    private String msg;

    public String getName() {
        return name;
    }

    public Message setName(String name) {
        this.name = name;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}


