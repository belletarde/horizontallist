package com.app.cat.kevin.horizotallist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.custom_suggestion_card_item.*

class AdapterReciper() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    public interface OnImageClick {
        fun onImageClickListener(position: Int)
    }

    private var onImageClick : OnImageClick? = null
    private var context : Context? = null

    private var messagesList: MutableList<ModelTest> = ArrayList()

    override fun getItemCount(): Int {
        return messagesList.size
    }

    fun setListView(modelTest: MutableList<ModelTest>, context: Context) {
        this.messagesList.addAll(modelTest)
        this.context = context
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemViewHolder).bind(messagesList[position], onImageClick, position, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_suggestion_card_item, parent, false))
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {
        override val containerView = itemView
        private lateinit var viewModel: ModelTest



        fun bind(
            items: ModelTest,
            onImageClick: OnImageClick?,
            position: Int,
            context: Context?
        ) {




            viewModel = items
            imgAdapter.setOnClickListener {
                onImageClick?.onImageClickListener(position)
            }

            with(viewModel) {
                if(nameModelTest.isNotEmpty()) {
                    var txtIsExpanded = false
                    textAdapter.maxLines = 1
                    textAdapter.text = nameModelTest
                    textAdapter.setOnClickListener {
                        if(!txtIsExpanded) {
                            textAdapter.maxLines = Int.MAX_VALUE
                            txtIsExpanded = true
                            seeMore.text = "Ver menos"
                        } else {
                            textAdapter.maxLines = 1
                            txtIsExpanded = false
                            seeMore.text = "Ver mais"
                        }
                    }
                } else {

                }

            }
        }
    }

}