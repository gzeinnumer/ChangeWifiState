package com.gzeinnumer.changewifistate;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button on, off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on = findViewById(R.id.btnOn);
        off = findViewById(R.id.btnOff);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifi =(WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(MainActivity.this, "Wifi On", Toast.LENGTH_SHORT).show();
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                Toast.makeText(MainActivity.this, "Wifi On", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
