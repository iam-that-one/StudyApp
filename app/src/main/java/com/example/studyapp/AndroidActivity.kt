package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        var topic = mutableListOf<String>("Gradle","Manifest","Java Folder","Themes Folder","activity_main.xml","Snackbar","Recycler View")
        var des = mutableListOf<String>("Gradle files make importing dependencies possible.","The Android Manifest allows us to request Android permissions","The three subfolders inside of the 'Java' folder, and each of them has its own purpose.","We can find the themes folder in the values folder."
        ,"We can find activity_main.xml in the layout folder. It is for designing UI in code/design","It is for showing alerts in our applications.","It for repairing views (text,buttons,images) which is listed inside list or array. “How to declare it in activity_main.xml” <androidx.recyclerview.widget.RecyclerView\n" +
                    "android:id=\"@+id/rvMain\" android:layout_width=\"match_parent\" android:layout_height=\"wrap_content\" app:layout_constraintBottom_toTopOf=\"@+id/linearLayout3\" app:layout_constraintTop_toTopOf=\"parent\" tools:layout_editor_absoluteX=\"16dp\" />\n" +
                    "“Hoe to declare it in class”\n" +
                    "package com.example.recycleviewapp\n" +
                    "import android.view.View\n" +
                    "import android.view.ViewGroup\n" +
                    "import androidx.recyclerview.widget.RecyclerView import android.telephony.ims.RcsUceAdapter import android.view.LayoutInflater\n" +
                    "import kotlinx.android.synthetic.main.item_row.view.*\n" +
                    "class RecycleViewAddapter(val students : List<String>) : RecyclerView.Adapter<RecycleViewAddapter.ItemViewHolder>() {\n" +
                    "class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)\n" +
                    "override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder { return ItemViewHolder(\n" +
                    "LayoutInflater.from(parent.context).inflate(\n" +
                    "R.layout.item_row, // You have to create new Layout called “item_row” parent,\n" +
                    "false\n" +
                    ") )" + "\n}\n" +
                    "override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {\n" +
                    "val student = students[position] holder.itemView.apply {\n" +
                    "textView6.text = student // In “item_row, you have to declare a text view for recycling” }\n" +
                    "}\n" +
                    "override fun getItemCount() = students.size }\n" +
                    "“Hoe to declare it in MainActivity class”\n" +
                    "val myRV = findViewById<RecyclerView>(R.id.rvM ain)\n" +
                    "myRV.adapter = RecycleViewAddapter(students) // students is a mutable list myRV.layoutM anager = LinearLayoutManager(this)")
        val myRV = findViewById<RecyclerView>(R.id.rvMain)
        myRV.adapter = RecycleViewAddapter2(topic,des)
        myRV.layoutManager = LinearLayoutManager(this)
    }
}