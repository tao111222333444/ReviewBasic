package com.hangzhou.mybroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.net.ConnectivityManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val filter = IntentFilter(Constants.FILTER_NAME2)
//        filter.priority = 1000
        registerReceiver(IBroadcastReceiver2(),filter)
        filter.priority = 888
        registerReceiver(IBroadcastReceiver3(),filter)

        button_1.setOnClickListener {
             Intent().also { intent ->
                 KLog.i(intent)
//                 intent.action = Constants.FILTER_NAME1
                 intent.setClass(this,IBroadcastReceiver1::class.java)
                 sendBroadcast(intent)
             }

        }

        button_2.setOnClickListener {
            val intent = Intent()
            intent.action = Constants.FILTER_NAME2
            sendBroadcast(intent)
        }

        button_3.setOnClickListener {
            val intent = Intent()
            intent.action = Constants.FILTER_NAME2
            sendOrderedBroadcast(intent,null)
        }
    }
}
