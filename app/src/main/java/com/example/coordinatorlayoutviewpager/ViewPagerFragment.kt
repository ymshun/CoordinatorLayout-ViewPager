package com.example.coordinatorlayoutviewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_view_pager.*

/**
 * A simple [Fragment] subclass.
 */
class ViewPagerFragment(private val position:Int) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        positionText.text = "フラグメント $position"
        val list = List<String>(15) {"RecyclerView$it"}
        val adapter = RecyclerViewAdapter(list)
        recyclerView.adapter  = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

}
