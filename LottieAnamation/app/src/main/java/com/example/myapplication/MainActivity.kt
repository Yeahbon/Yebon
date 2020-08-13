package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG : String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //좋아요 버튼에 클릭 리스너를 달아준다
        Like_btn.setOnClickListener {
            Log.d(TAG, "MainActivity - onCreate() called")
        }
    }
}