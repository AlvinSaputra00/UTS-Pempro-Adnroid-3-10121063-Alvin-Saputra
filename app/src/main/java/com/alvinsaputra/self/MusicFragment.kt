package com.alvinsaputra.self

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class MusicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize ImageView variables
        val imageMusic1: ImageView = view.findViewById(R.id.imageMusic1)
        val imageMusic2: ImageView = view.findViewById(R.id.imageMusic2)
        val imageMusic3: ImageView = view.findViewById(R.id.imageMusic3)


        // Set click listeners
        imageMusic1.setOnClickListener {
            openWebPage("https://www.youtube.com/watch?v=FRh7LvlQTuA&pp=ygURa2FrdHVzIHN1YXJhIGtheXU%3D")
        }

        imageMusic2.setOnClickListener {
            openWebPage("https://www.youtube.com/watch?v=FRh7LvlQTuA&pp=ygURa2FrdHVzIHN1YXJhIGtheXU%3D")
        }

        imageMusic3.setOnClickListener {
            openWebPage("https://www.youtube.com/watch?v=FRh7LvlQTuA&pp=ygURa2FrdHVzIHN1YXJhIGtheXU%3D")
        }
    }

    // Function to open a web page
    private fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(requireActivity().packageManager) != null) {
            startActivity(intent)
        }
    }
}
