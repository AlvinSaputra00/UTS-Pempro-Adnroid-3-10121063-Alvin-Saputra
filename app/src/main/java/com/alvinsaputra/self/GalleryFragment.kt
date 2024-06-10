package com.alvinsaputra.self

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class GalleryFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemlist: ArrayList<Int>
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }

    private fun init(view: View) {
        itemlist = ArrayList()
        recyclerView = view.findViewById(R.id.recycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        addToList()
        itemAdapter = ItemAdapter(itemlist)
        recyclerView.adapter = itemAdapter
    }

    private fun addToList() {
        itemlist.add(R.drawable.pantai1)
        itemlist.add(R.drawable.pantai2)
        itemlist.add(R.drawable.pantai3)
        itemlist.add(R.drawable.pantai4)
        itemlist.add(R.drawable.pantai5)
        itemlist.add(R.drawable.pantai6)
        itemlist.add(R.drawable.pantai7)
        itemlist.add(R.drawable.pantai8)
        itemlist.add(R.drawable.pantai9)
    }
}

