package com.example.lotteryprogram

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomNumberGenerator()

    }

    private fun randomNumberGenerator(){
        var isPressedButton = false
        var numberTyped = false

        button.setOnClickListener {

            var randomValues = List(6) { Random.nextInt(1, 49) }


            if (numberTyped){
                isPressedButton = false
                numberTyped = false
            }
            else{
                isPressedButton = true
//                displayNumber.text = randomValues.toString()
                val i = 0
                for (i in randomValues){
                    textView1.text = i.toString()
                    textView2.text = (i+1).toString()
                    textView3.text = (i+2).toString()
                    textView4.text = (i+3).toString()
                    textView5.text = (i+4).toString()
                    textView6.text = (i+5).toString()

                }
                numberTyped = true
            }

            num1.setOnClickListener {
                var randomValues = List(6) { Random.nextInt(1, 49) }
                if (numberTyped){

                    isPressedButton = false
                    numberTyped = false

                    isPressedButton = true
//                displayNumber.text = randomValues.toString()
                    val i = 0
                    for (i in randomValues){
                        textView1.text = randomValues.random().toString()
                    }
                    numberTyped = true
                }
            }

            num2.setOnClickListener {
                var randomValues = List(6) { Random.nextInt(1, 49) }
                if (numberTyped){

                    isPressedButton = false
                    numberTyped = false

                    isPressedButton = true
//                displayNumber.text = randomValues.toString()
                    val i = 0
                    for (i in randomValues){
                        textView2.text = randomValues.random().toString()
                    }
                    numberTyped = true
                }
            }

            num3.setOnClickListener {
                var randomValues = List(6) { Random.nextInt(1, 49) }
                if (numberTyped){

                    isPressedButton = false
                    numberTyped = false

                    isPressedButton = true
//                displayNumber.text = randomValues.toString()
                    val i = 0
                    for (i in randomValues){
                        textView3.text = randomValues.random().toString()
                    }
                    numberTyped = true
                }
            }

            num4.setOnClickListener {
                var randomValues = List(6) { Random.nextInt(1, 49) }
                if (numberTyped){

                    isPressedButton = false
                    numberTyped = false

                    isPressedButton = true
//                displayNumber.text = randomValues.toString()
                    val i = 0
                    for (i in randomValues){
                        textView4.text = randomValues.random().toString()
                    }
                    numberTyped = true
                }
            }

            num5.setOnClickListener {
                var randomValues = List(6) { Random.nextInt(1, 49) }
                if (numberTyped){

                    isPressedButton = false
                    numberTyped = false

                    isPressedButton = true
//                displayNumber.text = randomValues.toString()
                    val i = 0
                    for (i in randomValues){
                        textView5.text = randomValues.random().toString()
                    }
                    numberTyped = true
                }
            }

            num6.setOnClickListener {
                var randomValues = List(6) { Random.nextInt(1, 49) }
                if (numberTyped){

                    isPressedButton = false
                    numberTyped = false

                    isPressedButton = true
//                displayNumber.text = randomValues.toString()
                    val i = 0
                    for (i in randomValues){
                        textView6.text = randomValues.random().toString()
                    }
                    numberTyped = true
                }
            }
        }


    }
}