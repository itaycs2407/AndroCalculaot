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

    var testInput:String = ""

    var res = 0
    fun btnPlus(view: View){
        if (resText.text == "") {
            return
        }else
        {
            if (res == 0)
            {
            res = Integer.parseInt(testInput)
            testInput = ""
        }else{
                res += Integer.parseInt(testInput)
            }
            testInput = ""
            updateValue()
        }
    }
    fun res(view: View){


    }
    fun updateValue(){
        resText.text = testInput
        resultText.text = res.toString()
    }
    fun btn1(view: View){
        testInput = testInput + "1";
        updateValue()
    }
    fun btn2(view: View){
        testInput = testInput + "2";
        updateValue()
    }
    fun btn3(view: View){
        testInput = testInput + "3";
        updateValue()
    }
    fun btn4(view: View){
        testInput = testInput + "4";
        updateValue()
    }
    fun btn5(view: View){
        testInput = testInput + "5";
        updateValue()
    }

    fun btn6(view: View){
        testInput = testInput + "6";
        updateValue()
    }
    fun btn7(view: View){
        testInput = testInput + "7";
        updateValue()
    }
    fun btn8(view: View){
        testInput = testInput + "8";
        updateValue()
    }
    fun btn9(view: View){
        testInput = testInput + "9";
        updateValue()
    }
    fun btn0(view: View){
        testInput = testInput + "0";
        updateValue()
    }
}
