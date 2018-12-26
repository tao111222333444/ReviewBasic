package com.hugo.reviewbasic

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.singleTask.SingleTaskActivity
import kotlinx.android.synthetic.main.activity_flag.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/26.
 * 版本：v1.0
 * 描述：
 */
class FlagActivity :BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag)

        btn_standard.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        btn_task.setOnClickListener {
            val intent = Intent(this,SingleTaskActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}