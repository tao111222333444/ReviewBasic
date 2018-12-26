package com.hugo.reviewbasic.singleInstance

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R
import kotlinx.android.synthetic.main.activity_other_instance_1.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/26.
 * 版本：v1.0
 * 描述：
 */
class OtherActivity1 :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_instance_1)

        back_instance.setOnClickListener { startActivity(Intent(this,SingleInstanceActivity::class.java)) }
        button.setOnClickListener { startActivity(Intent(this,OtherActivity1::class.java)) }

        button_1.setOnClickListener { startActivity(Intent(this,OtherSingleInstanceActivity::class.java)) }
    }
}