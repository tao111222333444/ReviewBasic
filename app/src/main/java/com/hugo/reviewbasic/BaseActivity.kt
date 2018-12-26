package com.hugo.reviewbasic

import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * @author  作者：hugo
 * @date    时间：2018/12/19.
 * 版本：v1.0
 * 描述：
 */
open class BaseActivity : AppCompatActivity() {
    private val TAG = "hugo"
    private val ActivityName = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.i(TAG, "$ActivityName :onCreate 方法-------------------------")
        LogUtil.i(TAG,"$ActivityName :onCreate:"+javaClass.simpleName +"  hasCode:"+this.hashCode() +"  TaskId:"+taskId+ "   TaskNum:"
                +LogUtil.getTask(this)+"   TaskAffinity:" +dumpTaskAffinity())
        setTitle("$ActivityName")
    }

    override fun onStart() {
        super.onStart()
        LogUtil.i(TAG,"$ActivityName :onStart 方法------------------  hasCode:"+this.hashCode() )
    }

    override fun onStop() {
        super.onStop()
        LogUtil.i(TAG,"$ActivityName :onStop 方法-------------------  hasCode:"+this.hashCode() )
    }

    override fun onRestart() {
        super.onRestart()
        LogUtil.i(TAG,"$ActivityName :onRestart 方法-------------------  hasCode:"+this.hashCode() )
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.i(TAG,"$ActivityName :onDestroy 方法-------------------  hasCode:"+this.hashCode() )
    }

    override fun onResume() {
        super.onResume()
        LogUtil.i(TAG,"$ActivityName :onResume 方法--------------------  hasCode:"+this.hashCode() )
    }

    override fun onPause() {
        super.onPause()
        LogUtil.i(TAG,"$ActivityName :onPause 方法--------------------  hasCode:"+this.hashCode() )
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        LogUtil.i(TAG,"$ActivityName :onNewIntent 方法--------------------  hasCode:"+this.hashCode() )
        LogUtil.i(TAG,"$ActivityName :onNewIntent："+javaClass.simpleName +"  hasCode:"+this.hashCode() +"  TaskId:"+taskId+ "   TaskNum:"
                +LogUtil.getTask(this)+"   TaskAffinity:" +dumpTaskAffinity())
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        LogUtil.i(TAG,"$ActivityName :onSaveInstanceState 方法------------------  hasCode:"+this.hashCode() )
        super.onSaveInstanceState(outState)
        outState?.putString(TAG,"我是onSaveInstanceState()保存的数据")
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        LogUtil.i(TAG,"$ActivityName :onRestoreInstanceState 获取数据："+savedInstanceState?.get(TAG))
        LogUtil.i(TAG,"$ActivityName :onRestoreInstanceState 方法-------------------  hasCode:"+this.hashCode() )
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        LogUtil.i(TAG,"$ActivityName :onConfigurationChanged 方法------------------  hasCode:"+this.hashCode() )
        if(newConfig?.orientation == Configuration.ORIENTATION_LANDSCAPE){
            LogUtil.i(TAG,"$ActivityName :onConfigurationChanged 横屏")
            Toast.makeText(this,"横屏",Toast.LENGTH_SHORT).show()
        }else if(newConfig?.orientation == Configuration.ORIENTATION_PORTRAIT){
            LogUtil.i(TAG,"$ActivityName :onConfigurationChanged 竖屏")
            Toast.makeText(this,"竖屏",Toast.LENGTH_SHORT).show()
        }
    }

    fun dumpTaskAffinity() :String{
        val info = this.packageManager.getActivityInfo(componentName,PackageManager.GET_META_DATA)
        return info.taskAffinity
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        LogUtil.i(TAG,"$ActivityName :onActivityResult 获取数据："+data.toString()+"   requestCode:$requestCode")
    }
}