package com.alvinsaputra.self.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.alvinsaputra.self.R

class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize TextView from inflated layout
        val nextTextView = view.findViewById<TextView>(R.id.next)

        // Access ViewPager2 from Activity
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        // Set click listener on TextView
        nextTextView?.setOnClickListener {
            viewPager?.currentItem = 2
        }
    }
}
