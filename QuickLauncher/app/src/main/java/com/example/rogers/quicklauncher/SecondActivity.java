package com.example.rogers.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        if (getIntent().hasExtra("rogerchan.quicklauncher.something"))
        {
            TextView tv = findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("rogerchan.quicklauncher.something");
            tv.setText(text);

        }
    }
}
