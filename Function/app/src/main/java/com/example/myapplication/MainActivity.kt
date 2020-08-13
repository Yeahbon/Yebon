package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun newFunction(name : String, age : Int = 29, weight : Double = 65.6) {
            Log.d("fun", "name의 값은 ${name}입니다.")
            Log.d("fun","age의 값은 ${age}입니다.")
            Log.d("fun","weight 값은 ${weight}입니다.")
        }

        newFunction("Michael", weight = 67.5)
    }
}d