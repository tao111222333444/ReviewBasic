package com.hugo.reviewbasic.singleInstance

import android.os.Bundle
import com.hugo.reviewbasic.BaseActivity
import com.hugo.reviewbasic.R

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
    }
}
