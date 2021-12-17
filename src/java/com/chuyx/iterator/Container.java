package com.chuyx.iterator;

/**
 * 迭代器模式：
 *  提供一种方法顺序方案一个聚合对象中的各个元素，而又无需暴露该对象的内部表示
 * @author yuxiang.chu
 * @date 2021/12/17 13:57
 **/
public interface Container {

    public Iterator getIterator();
}
