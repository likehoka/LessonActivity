package com.example.hoka.lessonactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var result: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result = result!! + 1
        Log.d("mLog", "result = " + result)
    }

    override fun onStart() {
        result = result!! + 1
        Log.d("mLog", "result = " + result)
        super.onStart()
    }

    override fun onResume() {
        result = result!! + 1
        Log.d("mLog", "result = " + result)
        super.onResume()
    }

    override fun onPause() {
        result = result!! - 1
        Log.d("mLog", "result = " + result)
        super.onPause()
    }

    override fun onStop() {
        result = result!! - 1
        Log.d("mLog", "result = " + result)
        super.onStop()
    }

    override fun onDestroy() {
        result = result!! - 1
        Log.d("mLog", "result = " + result)
        super.onDestroy()
    }

    override fun onRestart() {
        result = result!! + 2
        Log.d("mLog", "result = " + result)
        super.onRestart()
    }
}
