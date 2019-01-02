package com.hugo.myservice

import android.app.Service
import android.content.Intent
import android.content.res.Configuration
import android.os.IBinder

/**
 * @author  作者：hugo
 * @date    时间：2018/12/27.
 * 版本：v1.0
 * 描述：
 */
open class BaseService :Service(){
    val TAG = "hugo"
    override fun onCreate() {
        super.onCreate()
        LogUtil.i(TAG,"onCreate-----------")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        LogUtil.i(TAG,"onStartCommand-----------")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.i(TAG,"onDestroy-----------")
    }
    override fun onBind(intent: Intent?): IBinder? {
        LogUtil.i(TAG,"onBind-----------")
        return null
    }

    override fun onRebind(intent: Intent?) {
        super.onRebind(intent)
        LogUtil.i(TAG,"onRebind-----------")
    }
    override fun onUnbind(intent: Intent?): Boolean {
        LogUtil.i(TAG,"onUnbind-----------")
        return super.onUnbind(intent)
    }
    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        LogUtil.i(TAG,"onConfigurationChanged-----------")
    }




}