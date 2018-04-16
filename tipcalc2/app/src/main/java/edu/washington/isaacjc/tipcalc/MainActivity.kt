package edu.washington.isaacjc.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input = findViewById(R.id.editText2) as EditText
        val button = findViewById(R.id.button) as Button
        button.setOnClickListener({
            val amount = input.text.toString()
            val amountWithTip = amount.toDouble()*0.15
            val text = "The tip amount for 15% is $${"%.2f".format(amountWithTip)}"

            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        })
    }
}
