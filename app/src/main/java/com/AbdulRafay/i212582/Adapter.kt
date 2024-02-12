package com.AbdulRafay.i212582

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ItemClass {

    // String variable to hold the TextView
    // of the first item.
    // Variables for the item of second layout
    var image1: Int = 0
    var image2: Int = 0
    var text1: String? = null
    var text2: String? = null
    var text3: String? = null
    var text4: String? = null

    // public constructor for the second layout
    constructor(img1: Int, img2: Int, txt1: String, txt2: String, txt3: String, txt4: String) {
        this.image1 = img1
        this.image2 = img2
        this.text1 = txt1
        this.text2 = txt2
        this.text3 = txt3
        this.text4 = txt4
    }
}


class AdapterClass(private val itemClassList: List<ItemClass>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_items, parent, false)
        return RecyclerViewHolder(layout)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val img1 = itemClassList[position].image1
        val img2 = itemClassList[position].image2
        val txt1 = itemClassList[position].text1
        val txt2 = itemClassList[position].text2
        val txt3 = itemClassList[position].text3
        val txt4 = itemClassList[position].text4
        (holder as RecyclerViewHolder).setViews(img1, img2, txt1, txt2, txt3, txt4)

    }

    override fun getItemCount(): Int {
        return itemClassList.size
    }


    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imag1: ImageView = itemView.findViewById(R.id.imageView7)
        private val imag2: ImageView = itemView.findViewById(R.id.heart)
        private val textOne: TextView = itemView.findViewById(R.id.name)
        private val textTwo: TextView = itemView.findViewById(R.id.job)
        private val text3: TextView = itemView.findViewById(R.id.availability)
        private val text4: TextView = itemView.findViewById(R.id.price)

        fun setViews(image1: Int, image2: Int, textOne: String?, textTwo: String?,textThree: String?,textFour: String?) {
            imag1.setImageResource(image1)
            imag2.setImageResource(image2)
            this.textOne.text = textOne
            this.textTwo.text = textTwo
            this.text3.text = textThree
            this.text4.text = textFour

        }
    }
}
