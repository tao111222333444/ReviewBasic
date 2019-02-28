package com.hangzhou.mybroadcastreceiver

import android.app.job.JobService
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * @author  作者：hugo
 * @date    时间：2019/2/27.
 * 版本：v1.0
 * 描述：
 */
class IBroadcastReceiver4 : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        KLog.i("onReceive ===>  ${javaClass.simpleName}")

        StringBuilder().apply {
            append("Action: ${intent?.action}\n")
            append("URI: ${intent?.toUri(Intent.URI_INTENT_SCHEME)}\n")

            toString().also { log ->
                KLog.d( log)
                Toast.makeText(context, log, Toast.LENGTH_LONG).show()
            }
        }
    }
}