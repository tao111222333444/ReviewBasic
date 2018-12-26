package com.hugo.reviewbasic

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.hugo.reviewbasic.singleInstance.SingleInstanceActivity
import com.hugo.reviewbasic.singleTask.SingleTaskActivity
import com.hugo.reviewbasic.singleTop.SingleTopActivity
import com.hugo.reviewbasic.standard.StandardActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_dialog.setOnClickListener{
            val dialog = AlertDialog.Builder(this)
                    .setMessage("这是弹窗")
                    .setTitle("提示")
            dialog.show()

        }
        bottom_dialog1.setOnClickListener{
            startActivity(Intent(this,DialogActivity::class.java))
        }

        bottom_standard.setOnClickListener{
            startActivityForResult(Intent(this, StandardActivity::class.java),10012)
        }
        bottom_single_top.setOnClickListener{
            startActivityForResult(Intent(this, SingleTopActivity::class.java),10011)
        }

        bottom_single_task.setOnClickListener {
            startActivityForResult(Intent(this,SingleTaskActivity::class.java),10001)
        }

        bottom_single_instance.setOnClickListener {
            startActivityForResult(Intent(this,SingleInstanceActivity::class.java),10002)
        }

//        val intent =Intent(this,SingleInstanceActivity::class.java)
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//        startActivity(intent)
    }




}
