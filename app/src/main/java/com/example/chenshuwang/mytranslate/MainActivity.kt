package com.example.chenshuwang.mytranslate

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var resultCodeTextView: TextView? = null
    var translateBtn: Button? = null
    var inputText: EditText? = null

    fun Context.toast(message: CharSequence) =
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultCodeTextView = findViewById (R.id.resultCodeTextView) as TextView
        translateBtn = findViewById (R.id.translateBtn) as Button
        inputText = findViewById (R.id.inputText) as EditText

        translateBtn?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val getText = inputText?.text.toString()
                toast(getText)
                val charArr = getText.toCharArray()
                var newStr = ""

                charArr.forEach {
                    when(it.toString()) {
                        "A" -> newStr += CodeJuly.A.num.toString()
                        "B" -> newStr += CodeJuly.B.num.toString()
                        "C" -> newStr += CodeJuly.C.num.toString()
                        "D" -> newStr += CodeJuly.D.num.toString()
                        "E" -> newStr += CodeJuly.E.num.toString()
                        "F" -> newStr += CodeJuly.F.num.toString()
                        "G" -> newStr += CodeJuly.G.num.toString()
                        "H" -> newStr += CodeJuly.H.num.toString()
                        "K" -> newStr += CodeJuly.K.num.toString()
                        "L" -> newStr += CodeJuly.L.num.toString()
                        else -> {
                            newStr += it.toString()
                        }
                    }
                    resultCodeTextView?.setText(newStr)
                }
            }
        })
    }
}
