package com.hugo.myservice

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.content.ServiceConnection
import android.widget.Toast


/**
 * @author  作者：hugo
 * @date    时间：2018/12/26.
 * 版本：v1.0
 * 描述：自定义Service
 */
class MyService :BaseService(){


//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        Toast.makeText(this,"服务启动了",Toast.LENGTH_SHORT).show()
//        LogUtil.i("hugo",this.stopSelfResult(startId).toString())
//        return super.onStartCommand(intent, flags, startId)
//    }

    override fun onBind(intent: Intent?): IBinder? {
        super.onBind(intent)
        Toast.makeText(this,"服务绑定了",Toast.LENGTH_SHORT).show()
//        this.stopSelf()

        return MyBinder()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Toast.makeText(this,"服务解绑",Toast.LENGTH_SHORT).show()
        return super.onUnbind(intent)
//        return true
    }

    public interface MyIBinder{
        fun invokeMethodInMyService()
    }

    open class MyBinder :Binder() ,MyIBinder{

        fun stopService(){

        }

        override fun invokeMethodInMyService() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
}