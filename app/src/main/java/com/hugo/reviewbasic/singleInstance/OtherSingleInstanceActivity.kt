package com.hugo.reviewbasic.singleInstance

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R
import com.hugo.reviewbasic.standard.StandardActivity
import kotlinx.android.synthetic.main.activity_other_instance.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/26.
 * 版本：v1.0
 * 描述：
 */
class OtherSingleInstanceActivity :BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_instance)
        button_6.setOnClickListener { startActivity(Intent(this,OtherActivity1::class.java)) }
    }
}