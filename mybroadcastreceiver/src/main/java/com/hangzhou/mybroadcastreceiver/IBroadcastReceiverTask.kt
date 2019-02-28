package com.hangzhou.mybroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.AsyncTask

/**
 * @author  作者：hugo
 * @date    时间：2019/2/28.
 * 版本：v1.0
 * 描述：这个是执行耗时操作 调用 goAsync()
 */
class IBroadcastReceiverTask : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        KLog.i("IBroadcastReceiverTask")
//        Thread.sleep(30000)
        if (intent?.getBooleanExtra(Constants.FILTER_NAME_TASK,false) == true) {
            val pendingResult = goAsync()
            val task = Task(pendingResult, intent)
            //执行异步任务
            task.execute()
        }else {
            KLog.i("onReceive")
            ssss()
        }
    }



    private class Task(private val pendingResult:PendingResult,
            private val intent: Intent?
    ):AsyncTask<String,String,String>(){
        override fun doInBackground(vararg params: String?): String {
            KLog.i("doInBackground")
            ssss()
            return toString()
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            //必须调用 finish() 这样 BroadcastReceiver 才能被回收
            pendingResult.finish()
            KLog.i("完成耗时操作")
        }

    }
}

 fun ssss(){
    var time = 30
    do {
        Thread.sleep(1000)
        KLog.i(time)
        time--
    }while (time!=0)
}