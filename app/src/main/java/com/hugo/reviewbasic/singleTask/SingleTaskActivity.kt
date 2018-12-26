package com.hugo.reviewbasic.singleTask

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R
import kotlinx.android.synthetic.main.activity_single_task.*

/**
 * @author 作者：hugo
 * @date 时间：2018/12/20.
 * 版本：v1.0
 * 描述：
 */
class SingleTaskActivity :BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_task)
        button_1.setOnClickListener {
            startActivity(Intent(this,SingleTaskActivity::class.java))
        }
        button_2.setOnClickListener {
            startActivityForResult(Intent(this,OtherSingleTaskActivity::class.java),10021)
        }
        button_3.setOnClickListener {  startActivityForResult(Intent(this,OtherActivity::class.java),10022)}
    }

}
