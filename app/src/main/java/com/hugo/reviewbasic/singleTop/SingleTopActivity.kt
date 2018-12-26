package com.hugo.reviewbasic.singleTop

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R
import kotlinx.android.synthetic.main.activity_single_top.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/19.
 * 版本：v1.0
 * 描述：
 */
class SingleTopActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)
        button_1.setOnClickListener{
            startActivity(Intent(this, SingleTopActivity::class.java))
        }

        button_2.setOnClickListener{
            startActivity(Intent(this,OtherTopActiivty::class.java))
        }

    }
}