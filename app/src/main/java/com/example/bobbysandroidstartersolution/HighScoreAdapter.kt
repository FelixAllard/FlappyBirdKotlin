package com.example.bobbysandroidstartersolution

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(private val context: Context, private val entries: List<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return entries.size
    }

    override fun getItem(position: Int): Any {
        return entries[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)
        textView.text = entries[position]
        textView.textSize = 18f
        textView.setPadding(16, 16, 16, 16)
        return textView
    }
}
