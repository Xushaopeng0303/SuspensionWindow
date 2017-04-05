package com.xsp.suspension;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xsp.suspension.service.SusWindowService;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        findViewById(R.id.start_float_window).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, SusWindowService.class);
                startService(intent);
                finish();
            }
        });

        findViewById(R.id.stop_float_window).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, SusWindowService.class);
                stopService(intent);
            }
        });
    }
}
