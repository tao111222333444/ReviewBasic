package com.hangzhou.mybroadcastreceiver

import android.app.AlarmManager
import android.app.job.JobParameters
import android.app.job.JobScheduler
import android.app.job.JobService
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.annotation.RequiresApi
import android.content.ComponentName
import android.app.job.JobInfo
import android.os.AsyncTask


/**
 * @author  作者：hugo
 * @date    时间：2019/2/28.
 * 版本：v1.0
 * 描述：
 */
class IBroadcastReceiverJobService: BroadcastReceiver() {

    var JOB_TEST =10001
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onReceive(context: Context?, intent: Intent?) {
        KLog.i("IBroadcastReceiverJobService")
        val jobScheduler:JobScheduler = context?.getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler

        val jobInfo = JobInfo.Builder(JOB_TEST, ComponentName(context.packageName, MyJobService::class.java.getName()))
                .setPeriodic(AlarmManager.INTERVAL_FIFTEEN_MINUTES)
                .setPersisted(false)
                .build()
        jobScheduler.schedule(jobInfo)
        KLog.i("IBroadcastReceiverJobService   完成")
    }
}

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class MyJobService : JobService(){
    override fun onStopJob(params: JobParameters?): Boolean {
        KLog.i("onStopJob ===> 结束")
        return false
    }

    override fun onStartJob(params: JobParameters?): Boolean {
        KLog.i("onStartJob ===> 开始")

       object : AsyncTask<String, String, String>() {
            override fun doInBackground(vararg params: String?): String {
                ssss()
                return toString()
            }

           override fun onPostExecute(result: String?) {
               super.onPostExecute(result)
               KLog.i("onPostExecute ===> 开始")
               this@MyJobService.jobFinished(params,false)
           }

        }.execute()


        KLog.i("onStartJob ===> 结束")
        return true
    }

}

