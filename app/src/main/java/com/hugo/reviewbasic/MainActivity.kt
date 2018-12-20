package com.hugo.reviewbasic

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.hugo.reviewbasic.singletop.SingleTopActivity
import com.hugo.reviewbasic.standard.StandardActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_standard.setOnClickListener{
            startActivity(Intent(this, StandardActivity::class.java))
        }
        bottom_single_top.setOnClickListener{
            startActivity(Intent(this,SingleTopActivity::class.java))
        }
        bottom_dialog.setOnClickListener{
            val dialog = AlertDialog.Builder(this)
                    .setMessage("这是弹窗")
                    .setTitle("提示")
            dialog.show()

        }
        bottom_dialog1.setOnClickListener{
            startActivity(Intent(this,DialogActivity::class.java))
        }
    }




}
