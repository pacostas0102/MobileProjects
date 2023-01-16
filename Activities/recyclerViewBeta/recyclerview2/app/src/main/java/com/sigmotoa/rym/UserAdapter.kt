package com.sigmotoa.rym

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.sigmotoa.rym.databinding.ItemCharacterBinding

class UserAdapter(private val users:List<User>,
                  private val listener: onClickListener) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context=parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_character, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val character=users.get(position)
        val positionView=position+1
        with(holder)
        {
            setListener(character, positionView)
            binding.tvOrder.text=positionView.toString()
            binding.tvName.text=character.getFullName()
            Glide.with(context)
                .load(character.url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .circleCrop()
                .into(binding.imgPhoto)

        }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val binding = ItemCharacterBinding.bind(view)

        fun setListener(user: User, position: Int){
            binding.root.setOnClickListener{
                listener.onClick(user, position)
            }
        }

    }
}