import com.example.fibonacciseries.NumberRecyclerViewAdapter
import com.example.fibonacciseries.R

///udupackage com.example.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvNumbers = findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumbers.layoutManager = LinearLayoutManager(baseContext)
        var NumberAdapter = NumberRecyclerViewAdapter((fibonacci(100)))
        rvNumbers.adapter = NumberAdapter
    }
    }
fun fibonacci(nums:Int):List<BigInteger>{
    var numbers= MutableList<BigInteger>(nums,{ BigInteger.ZERO})
    var num1=BigInteger.ZERO
    var num2=BigInteger.ONE
    numbers[0]=num1
    numbers[1]=num2
    for(a in 1..nums){
        var sum=num1+num2
        num1=num2
        num2=sum
        numbers[a-1]=num1
    }
    return numbers
}
