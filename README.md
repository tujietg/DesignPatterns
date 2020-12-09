# 设计模式

> 23中设计模式学习笔记，代码实现。

| 设计模式名称 | 代码实现                                                     | 备注                                                       |
| ------------ | ------------------------------------------------------------ | ---------------------------------------------------------- |
| 001单例模式  | [7种单例](https://github.com/tujietg/DesignPatterns/tree/master/src/com/tujietg/singleton) | 使用基本上都是基于Spring的bean工厂保证单例                 |
| 002策略模式  | [商场会员制度+Comparator](https://github.com/tujietg/DesignPatterns/tree/master/src/com/tujietg/strategy) | 封装一系列的算法，使他们可以相互替换                       |
| 003工厂模式  | [三种工厂](https://github.com/tujietg/DesignPatterns/tree/master/src/com/tujietg/factory) | 简单工厂，方法工厂（针对单个产品），抽象工厂（针对产品族） |
| 004门面模式  | [回家打开电器](https://github.com/tujietg/DesignPatterns/tree/master/src/com/tujietg/facade) | 外部与子系统的通信必须通过一个的外观对象进行。 |
| 005调停者模式  | [主板的作用](https://github.com/tujietg/DesignPatterns/tree/master/src/com/tujietg/mediator) | 通过封装类与类之间的交互，达到解耦的目的。 |
| 006装饰器模式  | [4s店汽车改色](https://github.com/tujietg/DesignPatterns/tree/master/src/com/tujietg/wrapper) | 不通过继承方式增强类的功能。 |
| 007责任链模式  | [发帖的filter](https://github.com/tujietg/DesignPatterns/blob/master/src/com/tujietg/chain/Main.java) | 对一个对象或者请求一系列的处理组成一个链条 |
