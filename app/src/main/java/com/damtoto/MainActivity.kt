package com.damtoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.damtoto.databinding.ActivityMainBinding

lateinit var binding : ActivityMainBinding

// https://juahnpop.tistory.com/227
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val memoList = supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayoutA, memoList())
            .commit()
    }
}