package com.example.mycustomdialog_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")
    }


    fun onDialogBtnClicked(view: View){
        Log.d(TAG, "MainActivity - onDialogBtnClicked() called")


    }

}