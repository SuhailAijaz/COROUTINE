package com.example.coroutine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import retrofit2.http.POST

class AdapterClass(val context: Context,var postlist: List<PostsItem>): RecyclerView.Adapter<AdapterClass.InnerClass>() {
    class InnerClass(V: View) : RecyclerView.ViewHolder(V) {
        var userid: TextView
        var id: TextView
        var title: TextView
        var Body: TextView
        init {
            userid=V.findViewById(R.id.textView1)
            id=V.findViewById<TextView>(R.id.textView2)
            title=V.findViewById<TextView>(R.id.textView3)
            Body=V.findViewById<TextView>(R.id.textView4)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerClass {
val view=LayoutInflater.from(parent.context).inflate(R.layout.targetlayout,parent,false)
        return InnerClass(view)
    }

    override fun onBindViewHolder(holder: InnerClass, position: Int) {
        holder.userid.text=postlist[position].userId.toString()
        holder.id.text=postlist[position].id.toString()
        holder.title.text=postlist[position].title.toString()
        holder.Body.text=postlist[position].body.toString()



    }

    override fun getItemCount(): Int {
return postlist.size
    }


}