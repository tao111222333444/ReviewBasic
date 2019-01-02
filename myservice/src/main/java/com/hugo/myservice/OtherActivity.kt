package com.hugo.myservice

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_other.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/27.
 * 版本：v1.0
 * 描述：
 */
class OtherActivity :AppCompatActivity(){
    private  var myServiceConnection:ServiceConnection?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setTitle(javaClass.simpleName)
        btn_start_service.setOnClickListener { startService(Intent(this,MyService::class.java)) }
        btn_stop_service.setOnClickListener { stopService(Intent(this,MyService::class.java)) }

        btn_bind_service.setOnClickListener {
            if (myServiceConnection == null) {
                myServiceConnection = MyServiceConnection()
            }
            bindService(Intent(this,MyService::class.java),myServiceConnection, Context.BIND_AUTO_CREATE) }
        btn_unbind_service.setOnClickListener {
            if(myServiceConnection != null) {
                unbindService(myServiceConnection)
                myServiceConnection = null
            }}
    }

    override fun onDestroy() {
        super.onDestroy()
        if(myServiceConnection != null){
            unbindService(myServiceConnection)
        }
    }
    class MyServiceConnection: ServiceConnection {
        val TAG = "hugo"
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            LogUtil.i(TAG,"onServiceConnected------  ComponentName:$name")
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            LogUtil.i(TAG,"onServiceDisconnected------  ComponentName:$name")
        }

    }
}