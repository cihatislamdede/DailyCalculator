package com.cihatislamdede.calculatorinkotlin

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException
import kotlin.text.toInt as toInt1


class MainActivity : AppCompatActivity() {
    var num1: String = ""
    var num2: String = ""
    var operatorSign: String = ""
    var control: Int = 1
    var arOperator:Int = 0
    var resultEnd : Float? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.hide()
        val toast = Toast.makeText(applicationContext, "HESAP MAKİNESİNE HOŞGELDİNİZ!", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.TOP or Gravity.CENTER, 0, 500)
        toast.show()
        screenText.text = num1 + operatorSign + num2




    }

    fun click0 (view: View){
        if(control==1) {
            println("0'a basildi")
            num1 += "0"
        }
        else{
            num2 += "0"
        }
        screenText.text = num1 + operatorSign + num2

    }

    fun click1 (view: View){
        if(control==1) {
            num1 += "1"
        }
        else{
            num2 += "1"
        }
        //println(num1)
        screenText.text = num1 + operatorSign + num2

    }

    fun click2 (view: View){
        println("2'ye basildi")
        if(control==1) {
            num1 += "2"
        }
        else{
            num2 += "2"
        }
        screenText.text = num1 + operatorSign + num2
    }

    fun click3 (view: View){
        println("3'a basildi")
        if(control==1) {
            num1 += "3"
        }
        else{
            num2 += "3"
        }
        screenText.text = num1 + operatorSign + num2
    }

    fun click4 (view: View){
        println("4'e basildi")
        if(control==1) {
            num1 += "4"
        }
        else{
            num2 += "4"
        }
        screenText.text = num1 + operatorSign + num2
    }

    fun click5 (view: View){
        println("5'e basildi")
        if(control==1) {
            num1 += "5"
        }
        else{
            num2 += "5"
        }
        screenText.text = num1 + operatorSign + num2

    }
    fun click6 (view: View){
        println("6'ya basildi")
        if(control==1) {
            num1 += "6"
        }
        else{
            num2 += "6"
        }
        screenText.text = num1 + operatorSign + num2
    }

    fun click7 (view: View){
        println("7'ye basildi")
        if(control==1) {
            num1 += "7"
        }
        else{
            num2 += "7"
        }
        screenText.text = num1 + operatorSign + num2
    }

    fun click8 (view: View){
        println("8'e basildi")
        if(control==1) {
            num1 += "8"
        }
        else{
            num2 += "8"
        }
        screenText.text = num1 + operatorSign + num2
    }

    fun click9 (view: View){
        println("9'a basildi")
        if(control==1) {
            num1 += "9"
        }
        else{
            num2 += "9"
        }
        screenText.text = num1 + operatorSign + num2
    }

    fun clickNokta (view : View){
        println("Noktaya basildi")
        if(control==1) {
            num1 += "."
        }
        else{
            num2 += "."
        }
        screenText.text = num1 + operatorSign + num2

    }

    fun clickClear (view: View){
        println("Cleara basildi")
        num1=""
        num2=""
        operatorSign = ""
        control = 1
        arOperator = 0
        resultEnd = null
        resultText.text = ""
        screenText.text = num1 + operatorSign + num2

        //println(num1)
        //println(num2)

    }

    fun clickTopla (view: View){
        println("Toplaya basildi")

        if(control == 1){
            operatorSign = "+"
            control=2
        }

        screenText.text = num1 + operatorSign + num2
        arOperator = 1

    }

    fun clickEksi(view: View){
        println("Eksiye basildi")

        if(control == 1){
            operatorSign = "-"
            control=2
        }

        screenText.text = num1 + operatorSign + num2

        arOperator = 2

    }

    fun clickCarp (view: View){
        println("Carpa basildi")
        if(control == 1){
            operatorSign = "*"
            control=2
        }

        screenText.text = num1 + operatorSign + num2
        arOperator = 3
    }
    fun clickBol (view: View){
        println("Bole basildi")
        if(control == 1){
            operatorSign = "/"
            control=2
        }
        screenText.text = num1 + operatorSign + num2
        arOperator = 4
    }


    fun clickYuzde (view : View){
        println("Yuzdeye basildi")
        if(control == 1){
            operatorSign = "%"
            control=2
        }
        screenText.text = num1 + operatorSign + num2
        arOperator = 5

    }

    fun clickEsit (view : View){
        println("Esittire basildi")


        if (arOperator == 1){ // +
            resultEnd = num1.toFloat() + num2.toFloat()
            resultText.text = resultEnd.toString()
        }
        else {
            if (arOperator == 2){ // -
                resultEnd = num1.toFloat() - num2.toFloat()
                resultText.text = resultEnd.toString()
            }
            else if(arOperator == 3){ //*
                resultEnd = num1.toFloat() * num2.toFloat()
                resultText.text = resultEnd.toString()
            }
            else if(arOperator == 4){ // /
                resultEnd = num1.toFloat() / num2.toFloat()
                resultText.text = resultEnd.toString()
            }
            else if(arOperator == 5){ // %
                resultEnd = (num1.toFloat() * num2.toFloat())/100
                resultText.text = resultEnd.toString()
            }
        }

    }

    fun clickDelete(view: View){
        println("Deleteye basildi")
        if(control==1) {
            if(num1.length == 0 ){
                num1=""
            }else {
                num1 = num1.dropLast(1)
                screenText.text = num1 + operatorSign + num2
            }
        }
        else{
            if(num2.length == 0){
                num2=""
            }
            else{
                num2 = num2.dropLast(1)
                screenText.text = num1 + operatorSign + num2
            }

        }



    }




}




