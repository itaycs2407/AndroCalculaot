package www.myapp.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var testInput: String = ""
    var actStaus = ""
    var res = 0

    fun doCalc(act: String) {
        // if user didnt type anything
        if (resText.text == "") {
            return
        } else { // some input
            if (res == 0) {
                res = Integer.parseInt(testInput)
                actStaus = act
                println(actStaus)
            } else {
                if (act == "Plus") {
                    if (actStaus == "Minus") {
                        actStaus = "Plus"
                        res -= Integer.parseInt(testInput)
                    } else res += Integer.parseInt(testInput)
                } else if (act == "Minus") {
                    if (actStaus == "Plus") {
                        actStaus = "Minus"
                        res += Integer.parseInt(testInput)
                    }else res -= Integer.parseInt(testInput)
                }

            }
        }
        actStaus = act
        testInput = ""
        updateValue()
    }

        fun btnPlus(view: View) {
            doCalc("Plus")
        }

        fun btnMin(view: View) {
            doCalc("Minus")
        }

        fun btnRes(view: View) {
            if (resText.text != "") {
                if (actStaus == "Plus") res += Integer.parseInt(testInput)
                if (actStaus == "Minus") res -= Integer.parseInt(testInput)
            }
            updateValue()

            res = 0
            testInput = ""
            resText.text = ""
        }
    // log to UI the current res
        fun updateValue() {
            resText.text = testInput
            resultText.text = res.toString()
        }

    // adding the numbers to the inputSaver and log it to the UI
        fun btn1(view: View) {
            testInput = testInput + "1";
            updateValue()
        }

        fun btn2(view: View) {
            testInput = testInput + "2";
            updateValue()
        }

        fun btn3(view: View) {
            testInput = testInput + "3";
            updateValue()
        }

        fun btn4(view: View) {
            testInput = testInput + "4";
            updateValue()
        }

        fun btn5(view: View) {
            testInput = testInput + "5";
            updateValue()
        }

        fun btn6(view: View) {
            testInput = testInput + "6";
            updateValue()
        }

        fun btn7(view: View) {
            testInput = testInput + "7";
            updateValue()
        }

        fun btn8(view: View) {
            testInput = testInput + "8";
            updateValue()
        }

        fun btn9(view: View) {
            testInput = testInput + "9";
            updateValue()
        }

        fun btn0(view: View) {
            testInput = testInput + "0";
            updateValue()
        }
    }

