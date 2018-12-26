package com.hugo.reviewbasic.singleTask

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R
import kotlinx.android.synthetic.main.activity_other_task.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/21.
 * 版本：v1.0
 * 描述：
 */
class OtherSingleTaskActivity:BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_task)
        button_1.setOnClickListener {
            startActivity(Intent(this,SingleTaskActivity::class.java))
        }
        button_2.setOnClickListener {
            startActivity(Intent(this,OtherActivity::class.java))
        }
    }
}