package edu.washington.isaacjc.tipcalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.text.Editable
import android.text.TextWatcher



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input = findViewById(R.id.editText2) as EditText
        val button = findViewById(R.id.button) as Button
        input.addTextChangedListener(object : TextWatcher {

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (s.toString().trim { it <= ' ' }.isEmpty()) {
                    button.isEnabled = false
                } else {
                    button.isEnabled = true
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int,
                                           after: Int) {
                // TODO Auto-generated method stub

            }

            override fun afterTextChanged(s: Editable) {
                // TODO Auto-generated method stub

            }
        })




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
