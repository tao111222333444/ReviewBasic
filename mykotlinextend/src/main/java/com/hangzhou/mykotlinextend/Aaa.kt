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