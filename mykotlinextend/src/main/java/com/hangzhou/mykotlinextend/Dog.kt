package com.hangzhou.mykotlinextend

/**
 * @author  作者：hugo
 * @date    时间：2019/2/25.
 * 版本：v1.0
 * 描述：
 */
class Dog {

    fun showName(){
        print("Dog\n")
    }
}

fun Dog.showName(){
    print("Cat")
}
fun Dog.showName(name:String){
    print("Cat \n")
}

fun Dog?.toString():String{
    if (this == null) return "null \n"
    return toString()
}
fun main(args: Array<String>) {
    Dog().showName("")
    var dog:Dog? = null
    print(dog.toString())
    dog  = Dog()

    print(dog.toString())
}