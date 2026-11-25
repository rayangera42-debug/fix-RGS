package com.fixrsg.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
  WebView wv;
  protected void onCreate(Bundle b){
    super.onCreate(b);
    wv = new WebView(this);
    wv.getSettings().setJavaScriptEnabled(true);
    wv.getSettings().setDomStorageEnabled(true);
    wv.setWebViewClient(new WebViewClient());
    wv.loadUrl("https://578f1b7a59fa5f.app.lhr.life");
    setContentView(wv);
  }
  public void onBackPressed(){ if(wv.canGoBack()) wv.goBack(); else super.onBackPressed(); }
}
