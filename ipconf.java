package com.example.cctv;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ipconf extends AppCompatActivity {
    EditText cctv_ip;
    Button apply_btn;
    String spfName = "IpFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipconf);

        apply_btn = (Button)findViewById(R.id.apply_btn);
        cctv_ip = (EditText)findViewById(R.id.cctv_ip);

        SharedPreferences spf = getSharedPreferences(spfName, 0);
        final SharedPreferences.Editor editor = spf.edit();
        String str = spf.getString("ip", "");
        cctv_ip.setText(str);

        apply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strGet = cctv_ip.getText().toString();
                editor.putString("ip", strGet);
                editor.commit();
                Intent intent = new Intent( ipconf.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}
