package com.hugo.reviewbasic

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.standard.StandardActivity
import kotlinx.android.synthetic.main.activity_task_affinity.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/27.
 * 版本：v1.0
 * 描述：
 */
class TaskAffinity :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_affinity)
        btn_task_affinity.setOnClickListener { startActivity(Intent(this,TaskAffinity::class.java)) }
        btn_standard.setOnClickListener { startActivity(Intent(this,StandardActivity::class.java)) }
    }
}