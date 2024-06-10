package com.alvinsaputra.self

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.content.Intent
import android.net.Uri


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize ImageView variables
        val imageButton2: ImageView = view.findViewById(R.id.imageButtonInstagram)
        val imageButton1: ImageView = view.findViewById(R.id.imageButtonFacebook)
        val imageButton8: ImageView = view.findViewById(R.id.imageButtonTiktok)
        val imageButton9: ImageView = view.findViewById(R.id.imageButtonMaps)

        // Set click listeners
        imageButton2.setOnClickListener {
            openWebPage("https://www.facebook.com/profile.php?id=100008969688446")
        }

        imageButton1.setOnClickListener {
            openWebPage("https://www.instagram.com/alvinsaputr_?igsh=ZWtxeTVra21qOGN1")
        }

        imageButton8.setOnClickListener {
            openWebPage("https://www.tiktok.com/@alvinsaputra222?_t=8n3jlKA02uO&_r=1")
        }

        imageButton9.setOnClickListener {
            openWebPage("https://maps.app.goo.gl/4m7uh4hh5GWEnVf59")
        }
    }

    // Function to open a web page
    private fun openWebPage(url: String) {
        val webpage = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(requireActivity().packageManager) != null) {
            startActivity(intent)
        }
    }
}
