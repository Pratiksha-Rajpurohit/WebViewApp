package com.pratiksha.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val webView : WebView = findViewById(R.id.wv)
        var url  = intent.getStringExtra("url")

        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
//        webView.loadUrl("$url")

        webView.loadUrl(url!!)
    }
}