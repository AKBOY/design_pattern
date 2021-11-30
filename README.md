# chuyx_design_pattern
# 设计模式学习
## 设计模式分类：
- 创建型模式
  - 提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。
    - 单例 singleton
    - 工厂 factory
    - 抽象工厂 abstractFactory
    - 建造者模式 builder
- 结构型模式
  - 关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
    - 适配器 adapter
    - 代理 proxy
    - 外观 facade
    - 过滤器 filter
    - 桥接 bridge
- 行为型模式
  - 关注对象之间的通信。
    - 策略 strategy
    - 模板 template
    - 观察者 observer
    - 责任链 chain
    - 装饰器 decorator
    - 状态 state
    - 中介者 mediator
- J2EE模式
  - 特别关注表示层。这些模式是由 Sun Java Center 鉴定的。
  

## 设计模式六大原则（并不是 最好可以成为开发六大原则）
### 1. 开闭原则（Open Close Principle）
   &emsp; **对拓展开发、对修改关闭**。\
   &emsp; 就是在程序需要拓展的时候，不用去修改原有的代码，通过增加类、接口等其他文件来进行拓展，实现一个可拔插的效果。
### 2. 里氏替换原则（Lisov Substitution Principle）
   &emsp; **任何父类可以出现的地方，子类一定可以出现。**
### 3. 依赖倒转原则（Dependence Inversion Principle）
   &emsp; **针对接口编程**\
   &emsp; 依赖接口、抽象类 而不依赖具体实体类
### 4. 接口隔离原则（Interface Segregation Principle）
   &emsp; **能使用多个接口就使用多个接口**\
   &emsp; 降低类之间的耦合度。
### 5. 迪米特法则，别名：最少知道原则（Demeter Principle）
   &emsp; **对于某一个类来说，应该尽量少的与其它类发生相互作用，使功能模块之间相互独立**
### 6. 合成复用原则（Composite Reuse Principle）
   &emsp; **尽量使用合成/聚合（即实现接口）的方式，而不是使用继承**