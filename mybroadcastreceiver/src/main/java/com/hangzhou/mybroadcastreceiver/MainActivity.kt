package com.hangzhou.mybroadcastreceiver

import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager
import android.support.v4.net.ConnectivityManagerCompat
import android.util.SparseArray
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val sparseArray :SparseArray<BroadcastReceiver> by lazy { SparseArray<BroadcastReceiver>() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //创建一个 动作 过滤器
        val filter = IntentFilter()
        //设置监听 动作  可以设置多个
        filter.addAction(Constants.FILTER_NAME2)

        // 设置优先级  取值范围 -1000 到 1000 数值越大 优先级越高
        filter.priority = 1000
        //注册广播监听器
        sparseArray.put(0,IBroadcastReceiver2())
        registerReceiver(sparseArray[0],filter)
        filter.priority = 888
        sparseArray.put(1,IBroadcastReceiver3())
        registerReceiver(sparseArray[1],filter)
        //设置优先级
        filter.priority = 666
        //设置数据类型
//        filter.addDataType("text/plain")
        //设置URL
        filter.addDataScheme("https")
        // 设置类别
        filter.addCategory("android.intent.category.DEFAULT")
        sparseArray.put(2,IBroadcastReceiver4())
        registerReceiver(sparseArray[2],filter)

         val filterTask = IntentFilter()
        filterTask.addAction(Constants.FILTER_NAME_TASK)
//        sparseArray.put(3,IBroadcastReceiverTask())
        sparseArray.put(3, IBroadcastReceiverJobService())
        registerReceiver(sparseArray[3],filterTask)


//        LocalBroadcastManager.getInstance(this).sendBroadcastSync()

        button_1.setOnClickListener {
//             Intent().also { intent ->
//                 KLog.i(intent)
//                 intent.setClass(this,IBroadcastReceiver1::class.java)
//                 sendBroadcast(intent)
//             }

//            Intent(this,IBroadcastReceiver1::class.java).also { intent ->
//                KLog.i(intent)
//                sendBroadcast(intent)
//            }

//            Intent().also { intent ->
//                //                 KLog.i(intent)
//                 intent.setClassName(this,IBroadcastReceiver1::class.java.name)
//                 sendBroadcast(intent)
//             }

            Intent().also { intent ->
                //                 KLog.i(intent)
                intent.component = ComponentName(this,IBroadcastReceiver1::class.java)
                sendBroadcast(intent)
            }

        }

        button_2.setOnClickListener {
            val intent = Intent()
            intent.action = Constants.FILTER_NAME2
            //设置类别
            intent.addCategory("android.intent.category.DEFAULT")
            //设置数据类型
//            intent.type = "text/plain"
            //设置URL
            intent.data = Uri.parse("https://www.baidu.com")
            // 设置 数据类型和URL
//            intent.setDataAndType(Uri.parse("https://www.baidu.com"),"text/plain")
            sendBroadcast(intent)
        }

        button_3.setOnClickListener {
            val intent = Intent()
            intent.action = Constants.FILTER_NAME2
            sendOrderedBroadcast(intent,null)
        }

        button_task.setOnClickListener {
            val intent = Intent()
            intent.action = Constants.FILTER_NAME_TASK
            sendBroadcast(intent)
            KLog.i("发送广播 IBroadcastReceiverTask")
        }

        button_task_1.setOnClickListener {
            val intent = Intent()
            intent.action = Constants.FILTER_NAME_TASK
            intent.putExtra(Constants.FILTER_NAME_TASK,true)
            sendBroadcast(intent)
            KLog.i("发送广播 IBroadcastReceiverTask")

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        repeat(sparseArray.size()){
            unregisterReceiver(sparseArray[it])
        }

    }
}
