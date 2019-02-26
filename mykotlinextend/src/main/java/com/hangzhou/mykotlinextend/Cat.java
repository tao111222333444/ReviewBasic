package com.hangzhou.mykotlinextend;

/**
 * @author 作者：hugo
 * @date 时间：2019/2/23.
 * 版本：v1.0
 * 描述：
 */
public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    /**新增加吃东西的功能*/
    public void eat(String food){
        System.out.print(name+":吃了 "+food);
        Animal animal = new Animal("cat");
        //java 中调用kotlin 扩展函数
        AaaKt.eat(animal,"apple");
    }

}
