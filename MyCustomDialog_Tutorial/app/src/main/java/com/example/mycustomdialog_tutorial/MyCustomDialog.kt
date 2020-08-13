package com.example.mycustomdialog_tutorial

import android.app.Dialog
import android.content.Context
import android.os.Bundle

class MyCustomDialog(context: Context) : Dialog(context) {
    val TAG: String = "로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}