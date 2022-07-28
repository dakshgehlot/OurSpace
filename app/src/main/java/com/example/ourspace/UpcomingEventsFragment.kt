package com.example.ourspace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ourspace.databinding.FragmentUpcomingEventsBinding

class UpcomingEventsFragment : Fragment() {

    private var _binding: FragmentUpcomingEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentUpcomingEventsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val rsvpButton = binding.rsvpButton

        rsvpButton.setOnClickListener {
            if (rsvpButton.text == "RSVP"){
                rsvpButton.setText("RSVP-ed!")
                }
            else{
                rsvpButton.setText("RSVP")
            }
        }
        return root
    }
}
