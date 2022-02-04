package com.example.appswap

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var imagePos = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_swap.setOnClickListener {
            when(imagePos){

                1 -> {
                    iv_one.setImageResource(R.drawable.kermit1)
                    iv_four.setImageResource(R.color.black)
                    imagePos++
                }
                2 ->{
                    iv_two.setImageResource(R.drawable.kermit1)
                    iv_one.setImageResource(R.color.black)
                    imagePos++

                }
                3-> {
                    iv_three.setImageResource(R.drawable.kermit1)
                    iv_two.setImageResource(R.color.black)
                    imagePos++

                }else -> {
                    iv_four.setImageResource(R.drawable.kermit1)
                    iv_three.setImageResource(R.color.black)
                    imagePos = 1
                }

            }
        }




    }
}