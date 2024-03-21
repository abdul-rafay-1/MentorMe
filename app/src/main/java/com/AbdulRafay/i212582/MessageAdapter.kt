package com.AbdulRafay.i212582

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso

data class Message(var messageid:String? = null, var message:String? = null, var messageType:String? = null, var senderid:String? = null, var receiverid:String? = null)

class MessageAdapter(
    val context: Context,
    val messageList: ArrayList<Message>,
    val messageClickListener: MessageAdapter.MessageClickListener
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val ITEM_RECEIVE = 1
    val ITEM_SENT = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        if (viewType == 1) {
            val view: View =
                LayoutInflater.from(context).inflate(R.layout.image_send, parent, false)
            return ReceiveViewHolder(view)
        } else {
            val view: View =
                LayoutInflater.from(context).inflate(R.layout.message_send, parent, false)
            return SentViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentMessage = messageList[position]
        if (holder.javaClass == SentViewHolder::class.java) {

            val viewHolder = holder as SentViewHolder
            holder.sentMessage.text = currentMessage.message

        } else {

            val viewHolder = holder as ReceiveViewHolder
            Picasso.get().load(currentMessage.message).into(holder.sentImage)

        }

    }

    override fun getItemViewType(position: Int): Int {
        val currentMessage = messageList[position]
        if (currentMessage.messageType == "text") {
            return ITEM_SENT
        } else {
            return ITEM_RECEIVE
        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }


    class SentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sentMessage = itemView.findViewById<TextView>(R.id.sentmessage)
    }

    class ReceiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sentImage = itemView.findViewById<ImageView>(R.id.imageSend)
    }

    interface MessageClickListener {
        fun onMessageClick(view: View, message: Message)
    }
}