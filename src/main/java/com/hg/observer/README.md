# 观察者模式（observer）

## 一、定义

定义对象之间的一种一对多依赖关系，使得当前每一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。

## 二、结构

Observer（抽象观察者）：观察者将对观察目标的改变做出反应

ConcreteObserver（具体观察者）：具体观察者中维持一个指向具体目标对象的引用，它用于存储具体观察者的有关状态，这些状态需要和具体目标地状态保持一致。

Subject（抽象目标）：又称为主题，是被观察的对象。

ConcreteSubject（具体目标）：抽象目标子类，通常包含有经常发生改变的数据，当它的状态发生改变时，向其各个观察者发出通知。

## 三、优点

可以实现表示层和数据逻辑层的分离，观察者和目标是松耦合的

支持广播通信，观察者会向已注册的观察者对象发送通知

增加新的观察者无需修改原有系统代码

## 四、缺点

如果个观察目标有很多直接或者间接的观察者，所有观察者收到通知会花费大量时间

如果观察者和观察目标之间存在循环依赖，可能导致系统崩溃

如果忘记删除不必要的订阅者，那么容易误发送消息

## 五、应用场景

一个抽象模型有两个方面看，其中一个方面依赖另一个方面，封装起来使其独立改变和复用

一个对象的改变将导致一个或多个其他对象也发生改变，但并不知道具体有多少个对象将要发生改变

当一个对象必须通知其他对象，但是你又希望这个对象与被通知的对象时松耦合的

## 六、个人总结

1、通过微博的例子理解观察者模式，如果你使用过微博，那么观察者模式你可以直接理解为多个粉丝关注同一个明星的微博，当明星发送微博（目标发送消息），所有关注的人都会收到消息（所有订阅的观察者都能收到消息）收到的微博是一样的。（所以的观察者收到的消息是一样的）如果取消关注，那么就收不到消息（观察者取消订阅目标之后，就不能收到消息了），可以随时关注随时取消。明星不需要知道有多少人关注，只要发送微博就行（目标不需要知道有多少人订阅）

2、观察者模式有两种方式

第一种：推送模式，目标向观察者主动推送消息

优点：获取消息及时，一有消息变动就会被观察者直接知道

缺点：观察者不需要一些消息的时候，会被迫收到很多不必要的信息

第二种：获取模式，观察者向目标获取消息

优点：需要就获取，不需要就不获取，灵活一些

缺点：如果不获取，那么消息就不会被知道

3、观察者模式和别的模式有关系