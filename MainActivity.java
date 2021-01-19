package com.example.cctv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {
    WebView webView;
    Button ip_btn;
    Button on_btn;
    Button off_btn;
    Button left_btn;
    Button right_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ip_btn = (Button)findViewById(R.id.ip_btn);
        on_btn = (Button)findViewById(R.id.on_btn);
        off_btn = (Button)findViewById(R.id.off_btn);
        left_btn = (Button)findViewById(R.id.left_btn);
        right_btn = (Button)findViewById(R.id.right_btn);
        webView = (WebView) findViewById(R.id.wv_stream);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

        SharedPreferences spf = getSharedPreferences("IpFile", 0);
        String ip = spf.getString("ip", "");

        String url1 = "http://";
        String url2 = ":5000/";
        String url = url1.concat(ip).concat(url2);
        final String url_on = url1.concat(ip).concat(":5000/on");
        final String url_off = url1.concat(ip).concat(":5000/off");
        final String url_left = url1.concat(ip).concat(":5000/left");
        final String url_right = url1.concat(ip).concat(":5000/right");

        webView.loadUrl(url);

        ip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, ipconf.class);
                finish();
                startActivity(intent);
            }
        });

        on_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "방범 시스템 켜짐", Toast.LENGTH_SHORT).show();
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(url_on)
                        .build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        call.cancel();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                    }
                });
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
        off_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "방범 시스템 꺼짐", Toast.LENGTH_SHORT).show();
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(url_off)
                        .build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        call.cancel();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                    }
                });
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(url_left)
                        .build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        call.cancel();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                    }
                });
            }
        });
        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url(url_right)
                        .build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        call.cancel();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                    }
                });
            }
        });
    }
}
