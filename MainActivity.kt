package com.example.listviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val names = arrayOf("Fox",  "Falco", "Marth", "Jigglypuff", "Sheik", "Captain Falcon", "Peach", "Ice Climbers")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )

        listView.adapter= arrayAdapter

        listView.setOnItemClickListener{adapterView, view, i, l ->
            Toast.makeText(this, "Item Selected "+ names[i], Toast.LENGTH_LONG)
                .show()
        }
    }
}
