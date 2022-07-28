package com.example.ourspace.ui.about_us

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ourspace.databinding.FragmentAboutUsBinding

class AboutUsFragment : Fragment() {
    private lateinit var aboutUsViewModel: AboutUsViewModel
    private var _binding: FragmentAboutUsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aboutUsViewModel = ViewModelProvider(this)[AboutUsViewModel::class.java]
        _binding = FragmentAboutUsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val button: Button = binding.faqButton
        button.setOnClickListener {
            val intent = Intent(this.activity, PdfActivity::class.java)
            startActivity(intent)
        }

//        val textView: TextView = binding.textDashboard
//        aboutUsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}