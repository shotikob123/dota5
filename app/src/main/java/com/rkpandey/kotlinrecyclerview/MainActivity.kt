package com.rkpandey.kotlinrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvContacts.adapter = ContactAdapter(this, createContacts())
        rvContacts.layoutManager = LinearLayoutManager(this)
        rvContacts.layoutManager = GridLayoutManager(this, 2)
    }

    private fun createContacts(): List<Contact> {
        val contacts = mutableListOf<Contact>()
        for (i in 1..15) contacts.add(Contact("ფოტო #$i", i))
        return contacts
    }
}
