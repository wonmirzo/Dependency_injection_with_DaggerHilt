package com.wonmirzo.di.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wonmirzo.di.R
import com.wonmirzo.di.databinding.ItemPostListBinding
import com.wonmirzo.di.model.Post

class PostAdapter(private var items: ArrayList<Post>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PosterViewHolder(ItemPostListBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PosterViewHolder) {
            holder.onBind(position)
        }
    }

    inner class PosterViewHolder(private var binding: ItemPostListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(position: Int) {
            val item = items[position]
            binding.apply {
                tvTitle.text = item.title.uppercase()
                tvBody.text = item.body
            }
        }
    }
}