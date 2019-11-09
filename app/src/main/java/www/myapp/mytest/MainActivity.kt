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
    fun updateValue(){
        resText.text = testInput
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


}
