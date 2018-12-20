package com.hugo.reviewbasic.singletop

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R
import kotlinx.android.synthetic.main.activity_other_top.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/19.
 * 版本：v1.0
 * 描述：
 */
class OtherTopActiivty:BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_top)
        back_single_top.setOnClickListener{
            startActivity(Intent(this,SingleTopActivity::class.java))
        }
    }
}