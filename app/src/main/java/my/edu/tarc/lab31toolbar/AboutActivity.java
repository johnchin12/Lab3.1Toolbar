package my.edu.tarc.lab31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webView = new WebView(this);
        setContentView(webView);

        webView.loadUrl("https://www.google.com/");

        WebView webViewAbout = (WebView)findViewById(R.id.webViewAbout);


    }
}
