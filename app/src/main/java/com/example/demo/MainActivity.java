package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "e0c31db0-9833-40f8-920e-e58fd0438a1c",
                  Analytics.class, Crashes.class);
    }
}
