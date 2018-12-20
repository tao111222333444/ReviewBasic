package com.hugo.reviewbasic

import android.os.Bundle
import kotlinx.android.synthetic.main.dialog_commom_default_content.*

/**
 * @author  作者：hugo
 * @date    时间：2018/12/19.
 * 版本：v1.0
 * 描述：
 */
class DialogActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_commom_default_content)
        finish()
        tv_dialog_common_content.setOnClickListener {
            finish()
        }
    }
}