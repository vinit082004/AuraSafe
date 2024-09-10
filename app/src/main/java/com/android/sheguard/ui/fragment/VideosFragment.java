package com.android.sheguard.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.android.sheguard.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VideosFragment extends Fragment {

    @SuppressLint("SetJavaScriptEnabled")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_videos, container, false);

        // Find WebView instances
        WebView webView1 = view.findViewById(R.id.webView1);
        WebView webView2 = view.findViewById(R.id.webView2);

// Enable JavaScript and set WebChromeClient for both WebViews
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebChromeClient(new WebChromeClient());

        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebChromeClient(new WebChromeClient());

// HTML content for each video
        String video1 = "<html><body>" +
                "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sNUcUDmtckU?si=eCTjI5dcSi5x2NEz\" title=\"YouTube video player2\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>" +
                "</body></html>";

        String video2 = "<html><body>" +
                "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qbE0fzZ2Nfo?si=2Pa8PFQJOm9ZuPDk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>" +
                "</body></html>";

// Load content into each WebView
        webView1.loadData(video1, "text/html", "utf-8");
        webView2.loadData(video2, "text/html", "utf-8");


        return view;
    }
}