package com.jay.jaysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jay.library.jaysample.JaySample

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        JaySample().getString()
    }
}