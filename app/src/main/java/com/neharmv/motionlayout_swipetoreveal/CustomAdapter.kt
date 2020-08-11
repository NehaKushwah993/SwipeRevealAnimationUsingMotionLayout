package com.neharmv.swipetoreveal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Neha
 */
public class CustomAdapter : RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView: ConstraintLayout =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false) as MotionLayout

        return CustomViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return 20;
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
    }

}