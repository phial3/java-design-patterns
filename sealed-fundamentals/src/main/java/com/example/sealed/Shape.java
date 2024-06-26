package com.example.sealed;

/**
 * sealed关键字：
 * <p>
 * （1）用于声明一个类或接口是密封的，这意味着其他类不能随意地扩展或实现它。
 * （2）使用sealed关键字的类或接口可以指定一组特定的子类或实现者。
 * permits关键字：
 * <p>
 * （1）用来列出那些被允许直接扩展密封类或实现密封接口的具体类或接口。
 * （2）这些被允许的子类或实现者必须显式地列在permits子句中。
 * （3）permits子句放在sealed声明之后。
 */
public abstract sealed class Shape permits Circle, Rectangle, Triangle {
    public abstract double area();
    public abstract double parameter();
}
