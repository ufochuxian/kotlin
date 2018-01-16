package study.jigl.com.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.*

class MainActivity : AppCompatActivity() {

    private val items = listOf<String>(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        message.text = "Hello Kotlin";
//        toast("hello kotlin")
//        toast("Hello", Toast.LENGTH_LONG)

        var forecalist = findViewById<RecyclerView>(R.id.forecast_list) as RecyclerView

        forecalist.layoutManager = LinearLayoutManager(this)

        forecalist.adapter = ForecastListAdapter(items)

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
