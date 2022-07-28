package com.example.ourspace.ui.contact_us

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ourspace.databinding.FragmentContactUsBinding

class ContactUsFragment : Fragment() {

    private lateinit var contactUsViewModel: ContactUsViewModel
    private var _binding: FragmentContactUsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contactUsViewModel =
            ViewModelProvider(this)[ContactUsViewModel::class.java]

        _binding = FragmentContactUsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.githubConnect.setOnClickListener { goToUrl("https://github.com/dakshgehlot") }
        binding.instagramConnect.setOnClickListener { goToUrl("https://www.google.com/") }
        binding.facebookConnect.setOnClickListener { goToUrl("https://www.google.com/") }
        binding.discordConnect.setOnClickListener { goToUrl("https://www.google.com/") }
        binding.linkedinConnect.setOnClickListener { goToUrl("https://www.google.com/") }
        binding.twitterConnect.setOnClickListener { goToUrl("https://www.google.com/") }
        binding.wwwConnect.setOnClickListener { goToUrl("https://www.google.com/") }
        binding.mapImageview.setOnClickListener { goToUrl("https://maps.app.goo.gl/tSX1F3kdAaSogycA8") }
        binding.joinButton.setOnClickListener { goToUrl("https://www.google.com/") }
        binding.gmailConnect.setOnClickListener { sendMail() }

//        val textView: TextView = binding.textNotifications
//        contactUsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        return root
    }

    private fun goToUrl(url: String){
        val parsedUrl: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, parsedUrl)
        startActivity(intent)
    }

    private fun sendMail(){
        val recipient = arrayOf("dakshgehlot30@gmail.com")
        val subject = "Contact Enquiry"
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:")
        intent.putExtra(Intent.EXTRA_EMAIL, recipient)
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}