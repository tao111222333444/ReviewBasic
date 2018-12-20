package com.hugo.reviewbasic.standard

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.*
import com.hugo.reviewbasic.singletop.SingleTopActivity
import kotlinx.android.synthetic.main.activity_standard.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/19.
 * 版本：v1.0
 * 描述： Standard 启动模式
 */
class StandardActivity : BaseActivity(){
    lateinit var intents:Array<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)
        intents = Array(3){Intent()}
        intents[0] =Intent(this, StandardActivity::class.java)
        intents[1]=Intent(this, SingleTopActivity::class.java)
        intents[2]=Intent(this, SingleTopActivity::class.java)
        button.setOnClickListener{
            startActivity(Intent(this, StandardActivity::class.java))
//            startActivities(intents)
        }
    }

    override fun onPause() {
        super.onPause()
//        Thread.sleep(10000)
//        LogUtil.i("hugo","睡眠10000")
    }

}