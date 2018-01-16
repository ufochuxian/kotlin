package study.jigl.com.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        message.text = "Hello Kotlin";
//        toast("hello kotlin")
//        toast("Hello", Toast.LENGTH_LONG)



    }


    fun add(x: Int, y: Int): Int {
        return x + y
    }

    //如果返回的结果可以使用一个表达式计算出来，你可以不使用括号而是使用等号
    fun add1(x: Int, y: Int): Int = x + y

    //这里第二个参数指定了默认值，这样可以传参数，或者不传，不需要重载函数了
    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }


//    fun niceToast(message: String, tag: String = javaClass<MainActivity>().getSimpleName(), length: Int = Toast.LENGTH_SHORT) {
//        Toast.makeText(this, "[$className] $message", length).show()
//    }

}
