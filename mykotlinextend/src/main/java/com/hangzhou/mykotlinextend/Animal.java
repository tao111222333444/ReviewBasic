package com.hangzhou.mykotlinextend;

/**
 * @author 作者：hugo
 * @date 时间：2019/2/23.
 * 版本：v1.0
 * 描述：
 */
public class Animal {
    protected String name;
    Animal(String name){
        this.name = name;
    }

    public void showName(){
        System.out.print(name);
    }
}
