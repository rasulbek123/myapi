package com.example.myapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapi.model.Result
import com.example.myapi.model.UserData
import kotlinx.android.synthetic.main.item_userdata.view.*

class UserDataAdapter:RecyclerView.Adapter<UserDataAdapter.UserDataHolder>() {
    var models:List<Result> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    inner class UserDataHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun populeratmodel(model:Result){
            itemView.userId.text = model.id.toString()
            itemView.userCreatedData.text = model.creationTimeSeconds.toString()
            itemView.userHandle.text = model.commentatorHandle
            itemView.userLocale.text = model.locale
            itemView.userText.text = HtmlCompat.fromHtml(model.text,HtmlCompat.FROM_HTML_MODE_COMPACT)
            itemView.userRating.text = model.rating.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserDataHolder {
        var itemView:View = LayoutInflater.from(parent.context).inflate(R.layout.item_userdata,parent,false)
        return UserDataHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserDataHolder, position: Int) {
        holder.populeratmodel(models.get(position))
    }

    override fun getItemCount(): Int = models.size ?:0
}