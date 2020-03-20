package com.anrongtec.songtest

import android.os.Bundle
import android.view.Window
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn_load)
        val webView = findViewById<WebView>(R.id.web_view)
        btn.setOnClickListener({ view ->
            webView.loadUrl("http://www.jluai.com/battery")
            webView.setWebViewClient(WebViewClient())
            val settings = webView.getSettings()
            settings.setJavaScriptCanOpenWindowsAutomatically(true)
            settings.setJavaScriptEnabled(true)
        })


    }

}
