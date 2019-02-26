package com.hangzhou.mykotlinextend

/**
 * @author  作者：hugo
 * @date    时间：2019/2/26.
 * 版本：v1.0
 * 描述：
 */

class Snake{
    var aaa = 1
    companion object {
        var Bbb = 1
    }
}

var Snake.size:Int
    set(value) {aaa = value}
    get() = aaa +1

//错误：扩展属性不能有初始化
//val Snake.bbb = 1

fun Snake.Companion.foo(){}


    fun main(args: Array<String>) {
        val snake = Snake()
        print(snake.size)
        snake.size = 3
        print(snake.size)

        Snake.Bbb

        Snake.foo()
    }