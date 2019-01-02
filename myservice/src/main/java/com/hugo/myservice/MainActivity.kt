package com.hugo.myservice

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.widget.ScrollView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var myServiceConnection: MyServiceConnection?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(javaClass.simpleName)
        btn_start_service.setOnClickListener { startService(Intent(this,MyService::class.java)) }
        btn_stop_service.setOnClickListener { stopService(Intent(this,MyService::class.java)) }

        btn_bind_service.setOnClickListener {
            if(myServiceConnection == null){
            myServiceConnection =  MyServiceConnection()}
            bindService(Intent(this,MyService::class.java),myServiceConnection, Context.BIND_AUTO_CREATE)

        }
        btn_unbind_service.setOnClickListener {
            if(myServiceConnection != null) {
                unbindService(myServiceConnection)
                myServiceConnection = null
            }
            }

        btn_goto_other.setOnClickListener {
            startActivity(Intent(this,OtherActivity::class.java)) }
    }

    override fun onPause() {
        super.onPause()
        LogUtil.i("hugo","onPause()---------")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.i("hugo","onDestroy()---------")
    }

    fun stopService(){

    }
    class MyServiceConnection:ServiceConnection{
        val TAG = "hugo"
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            LogUtil.i(TAG,"onServiceConnected------  ComponentName:$name")
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            LogUtil.i(TAG,"onServiceDisconnected------  ComponentName:$name")
        }

    }
}
