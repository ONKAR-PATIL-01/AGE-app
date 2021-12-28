package com.example.minutes

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class MainActivity2 : AppCompatActivity() {

    lateinit var tv1:TextView
    lateinit var tv2:TextView
    lateinit var b2:Button
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        b2=findViewById(R.id.b2)
        tv1=findViewById(R.id.tv1)
        tv2=findViewById(R.id.tv2)
        b2.setOnClickListener { View->
            picker(View)

        }
    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun picker(view: View)
    {
        var calendar=Calendar.getInstance()
        var i=calendar.get(Calendar.YEAR)
      var i2=calendar.get(Calendar.MONTH)
        val i3=calendar.get(Calendar.DAY_OF_MONTH)
        var j=calendar.get(Calendar.YEAR)
        var j2=calendar.get(Calendar.MONTH)
        var j3=calendar.get(Calendar.DAY_OF_MONTH)


        var arr= arrayOf( 31, 28, 31, 30, 31, 30, 31,
        31, 30, 31, 30, 31 )
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, i, i2, i3 ->
            val st="$i3/${i2+1}/$i"

            tv1.text = st

            if(j3<i3)
            {
                j3=j3+arr[i2]
                j2=j2-1
            }
            if(i2>j2)
            {
                j=j-1
                j2=j2+12
            }

            val a=j3-i3
            val b=j2-i2
            val c=j-i
            val d=c*365+b*30+a
            val e=d*24
            val f=e*60
            val g=f*60

            val st1="$c years $b months $a days   \n    $d Total days  \n $e Total hours \n $f Total minutes  \n $g Total seconds   "
            tv2.text = st1


        },i,i2,i3).show()



















    }
}
