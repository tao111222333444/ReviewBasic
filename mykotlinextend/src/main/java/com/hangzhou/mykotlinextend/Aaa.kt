package com.hangzhou.mykotlinextend

import android.support.v7.app.AppCompatActivity

/**
 * @author  作者：hugo
 * @date    时间：2019/1/29.
 * 版本：v1.0
 * 描述： 扩展类
 */

/**
 * 给 Activity 扩展 Toast 函数
 */
fun AppCompatActivity.Toast(charSequence: CharSequence){
    android.widget.Toast.makeText(this,charSequence, android.widget.Toast.LENGTH_SHORT).show()
}

fun Animal.eat(food:String){
    print("$name  吃了  $food \n")
}

fun Cat.eat(food:String){
    print("$name  吃了  $food \n")
}

fun Animal.getFood() = "苹果"

fun Cat.getFood() = "猫粮"
fun printFood(food:Animal){
    print(food.getFood())
}

fun main(args: Array<String>) {
    val animal = Animal("dog")
    animal.eat("apple")

    val cat = Cat("cat")
    cat.eat("beef")

    printFood(cat)
}