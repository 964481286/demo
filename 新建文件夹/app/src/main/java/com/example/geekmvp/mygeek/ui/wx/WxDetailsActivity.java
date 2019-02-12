package com.example.geekmvp.mygeek.ui.wx;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;

import com.example.geekmvp.mygeek.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WxDetailsActivity extends AppCompatActivity {

    @BindView(R.id.web_view_wx)
    WebView webViewWx;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wx_details);
        ButterKnife.bind(this);
        Context context = this;
        setOut();
    }

    private void setOut() {
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        String title = intent.getStringExtra("title");
        toolbar.setTitle(title);
        //1.找到WebView控件
        //2.加载Url网址
        webViewWx.loadUrl(url);

        //3.设置webview客户端
        webViewWx.setWebViewClient(new WebViewClient());
        webViewWx.setWebChromeClient(new WebChromeClient());
    }
}
