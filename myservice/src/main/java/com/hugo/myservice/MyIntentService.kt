package com.hugo.myservice

import android.app.IntentService
import android.content.Intent

/**
 * @author  作者：hugo
 * @date    时间：2019/1/25.
 * 版本：v1.0
 * 描述：
 */
class MyIntentService:IntentService("MyIntentService") {
    override fun onHandleIntent(intent: Intent?) {
        //在这里实现一些业务
        LogUtil.i("hugo","onHandleIntent")
        Thread.sleep(5000)
    }
}