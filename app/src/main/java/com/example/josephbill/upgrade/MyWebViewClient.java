package com.example.josephbill.upgrade;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Joseph Bill on 7/22/2017.
 */

public class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
