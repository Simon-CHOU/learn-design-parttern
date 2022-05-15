package com.simon.design.pattern.singleton.runoob;

/**
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 */
public enum Singleton6 {
    INSTANCE;
    public void whatEverMethod(){}
}
