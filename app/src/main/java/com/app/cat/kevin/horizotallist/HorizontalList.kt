package com.app.cat.kevin.horizotallist
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.view.View
import com.app.cat.kevin.horizotallist.AdapterReciper
import com.app.cat.kevin.horizotallist.ModelTest
import com.app.cat.kevin.horizotallist.R
import kotlinx.android.synthetic.main.activity_main.*

class HorizontalList : AppCompatActivity() {
//
    private var adapterRecipe: AdapterReciper = AdapterReciper()
    private var layoutManager: LinearLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var messagesList: MutableList<ModelTest> = ArrayList()
        messagesList.add(ModelTest("Kevinrewihrewiiewi /n djfjdkfjdjfik ", "Test", "http://google.com"))
        messagesList.add(ModelTest("Kevin", "Test", "http://google.com"))
        messagesList.add(ModelTest("\"Kevin jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjdjskdjskdjskdjskjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjoi\"", "Test", "http://google.com"))
        messagesList.add(ModelTest("Kevin", "Test", "http://google.com"))
        messagesList.add(ModelTest("Kevin jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjdjskdjskdjskdjskjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjoi", "Test", "http://google.com"))
        messagesList.add(ModelTest("Kevin", "Test", "http://google.com"))
        messagesList.add(ModelTest("\"Kevin jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjdjskdjskdjskdjskjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjoi\"", "Test", "http://google.com"))


        layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        layoutManager?.isAutoMeasureEnabled = true
        layoutManager?.isSmoothScrollbarEnabled = true
//        layoutManager?.reverseLayout = true
        val helper = LinearSnapHelper()
        helper.attachToRecyclerView(chatRecycler)
        chatRecycler.layoutManager = layoutManager
        chatRecycler.adapter = adapterRecipe
        chatRecycler.setHasFixedSize(false)
        chatRecycler.visibility = View.VISIBLE
        adapterRecipe.setListView(messagesList, this)

//        val linearLayoutManager = LinearLayoutManager(this, )

    }
}



