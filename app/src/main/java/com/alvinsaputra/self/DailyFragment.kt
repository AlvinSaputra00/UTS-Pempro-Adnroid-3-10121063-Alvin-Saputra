package com.alvinsaputra.self

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DailyFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    private lateinit var imageList: ArrayList<Int>
    private lateinit var titleList: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageList = arrayListOf(
            R.drawable.baseline_fact_check_24,
            R.drawable.baseline_fact_check_24,
            R.drawable.baseline_fact_check_24,
            R.drawable.baseline_fact_check_24,
            R.drawable.baseline_fact_check_24
        )

        titleList = arrayListOf(
            "ListView",
            "ListView",
            "ListView",
            "ListView",
            "ListView"
        )

        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()


        recyclerView.adapter = AdapterClass(dataList)
    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
    }
}
