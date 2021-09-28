package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity() {
    lateinit var lbl1: TextView
    lateinit var lbl2: TextView
     var topic = mutableListOf<String>("Hello, World","Variables","Constants","User Input","for-loop","While-loop","String Concatenino","String Interpolation","Data Type","When Statement","\n" +
             "“if Statement","Try/Catch/Random numbers","Functions")





     var des = mutableListOf<String>("func main(){\n" +
             "println(“Hello, World”)\n" +
             "}","var name = “Abdullah” // Type inferring\n" +
             "var number = 0 // Type inferring\n" +
             "var age : Int = 6 // Type Annotation","// can not be changed\n" +
             "val name = “Abdullah” // Type inferring\n" +
             "val number = 10 // Type inferring\n" +
             "val age : Int = 6 // Type Annotation","var name = readLine() // Accept String\n" +
             "var age = readLine()!!.toInt() // Accept Integer","for i in array{\n" +
             "println(i) // prints all array elements\n" +
             "}","var count = 1\n" +
             "while(cont <= 10){\n" +
             "println(count) //prints numbers from 1 to 10\n" +
             "}","var firstname = “Abdullah”\n" +
             "var lastname = “Alnutayfi”\n" +
             "println(firstname + “ “ + lastname ) // prints Abdullah Alnutayfi","    println(“My name is \$firstname”) // prints My name is Abdullah)\n","Int: 5 Double: 5.5\nFloat : 5f\nString : “”","val grade = readLine()!!.toInt()\nwhen {\n" +
             "grade < 60 -> println(\"F\")\ngrade < 70 -> println(\"D\")\ngrade < 80 -> println(\"C\")\ngrade < 90 -> println(\"B\")\nelse -> println(\"A\")\n" +
             "}","var age = 15\n" +
             "if (age >= 15){\n" +
             "println(“true”)\n" +
             "}\n" +
             "//prints true because age is equal to 15","//It is for handling errors\n" +
             "val randomNumber = Random.nextInt(7, 15) val userGuess = readLine()\n" +
             "try{\n" +
             "If (userGuess!!.toInt() == randomNumber){ println(“yes”)\n" +
             "}\n" +
             "}catch (e : Exception){\n" +
             "println(\"something went wrong\") }","// Take an arguments\n" +
             "fun greet(name : String){ println(“Hello \$name”)\n" +
             "}\n" +
             "// Return a value\n" +
             "fun sum(num1 : Int, num2 : Int) : Int{\nreturn num1 + num2\n" +
             "}")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
//        lbl1 = findViewById(R.id.idTVCourseName)
//        lbl2 = findViewById(R.id.description)

        val myRV = findViewById<RecyclerView>(R.id.rvMain)
        myRV.adapter = RecycleViewAddapter(topic,des)
        myRV.layoutManager = LinearLayoutManager(this)
    }
}

