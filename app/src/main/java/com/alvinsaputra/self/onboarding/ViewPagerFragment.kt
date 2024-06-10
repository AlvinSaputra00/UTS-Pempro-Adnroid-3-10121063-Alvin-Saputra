package com.alvinsaputra.self.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alvinsaputra.self.R
import com.alvinsaputra.self.onboarding.screen.FirstScreen
import com.alvinsaputra.self.onboarding.screen.SecondScreen
import com.alvinsaputra.self.onboarding.screen.ThirdScreen
import androidx.viewpager2.widget.ViewPager2


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        // Access ViewPager2 by ID and set the adapter
        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapter

        return view
    }
}
