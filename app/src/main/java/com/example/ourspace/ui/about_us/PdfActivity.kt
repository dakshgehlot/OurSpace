package com.example.ourspace.ui.about_us

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ourspace.R
import com.github.barteksc.pdfviewer.PDFView

class PdfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        val pdfView: PDFView = findViewById(R.id.pdfview)
        pdfView.fromAsset("we_faqs.pdf").load()
    }
}