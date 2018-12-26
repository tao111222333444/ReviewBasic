package com.hugo.reviewbasic.singleInstance

import android.content.Intent
import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R
import kotlinx.android.synthetic.main.activity_single_instance.*

/**
 * @author 作者：hugo
 * @date 时间：2018/12/20.
 * 版本：v1.0
 * 描述：single_instance
 */
class SingleInstanceActivity:BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_instance)
        button66.setOnClickListener { startActivity(Intent(this,OtherSingleInstanceActivity::class.java)) }
        button65.setOnClickListener { startActivity(Intent(this,OtherActivity1::class.java)) }
    }
}
