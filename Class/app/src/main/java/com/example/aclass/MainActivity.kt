package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Kotlin()

        KotlinTwo("안녕")

        var Kotlin = KotlinThree()
        kotlin.printOne()
        kotlin.one = "Hello"
}